const API_URL = "/api/transactions";

// 🔒 Block access if not logged in
if (sessionStorage.getItem("loggedIn") !== "true") {
    window.location.href = "/login.html";
}

// ➕ Add Transaction
function addTransaction() {
    const data = {
        amount: document.getElementById("amount").value,
        category: document.getElementById("category").value,
        type: document.getElementById("type").value,
        description: document.getElementById("description").value
    };

    fetch(API_URL, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(data)
    }).then(() => {
        clearForm();
        loadTransactions();
    });
}

// 💰 Update Balance
function updateBalance(transactions) {
    let income = 0;
    let expense = 0;

    transactions.forEach(t => {
        if (t.type === "INCOME") {
            income += t.amount;
        } else {
            expense += t.amount;
        }
    });

    const balance = income - expense;
    const balanceEl = document.getElementById("balance");

    balanceEl.innerText = `Current Balance: ₹${balance}`;
    balanceEl.style.color = balance >= 0 ? "green" : "red";
}

// 📄 Load Transactions
function loadTransactions() {
    fetch(API_URL)
        .then(res => res.json())
        .then(data => {
            const list = document.getElementById("transactionList");
            list.innerHTML = "";

            data.forEach(t => {
                const li = document.createElement("li");
                li.innerHTML = `
                    ${t.type} - ₹${t.amount} (${t.category})
                    <span class="delete-btn" onclick="deleteTransaction(${t.id})">❌</span>
                `;
                list.appendChild(li);
            });

            // ✅ STEP 3: UPDATE BALANCE HERE
            updateBalance(data);
        });
}

// ❌ Delete Transaction
function deleteTransaction(id) {
    fetch(`${API_URL}/${id}`, {
        method: "DELETE"
    }).then(() => loadTransactions());
}

// 🧹 Clear Form
function clearForm() {
    document.getElementById("amount").value = "";
    document.getElementById("category").value = "";
    document.getElementById("description").value = "";
}

// 🔁 Initial load
loadTransactions();

