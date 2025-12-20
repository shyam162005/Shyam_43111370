function login() {

    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    if (username === "" || password === "") {
        document.getElementById("error").innerText =
            "Please enter username and password";
        return;
    }

    fetch("/api/auth/login", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            username: username,
            password: password
        })
    })
    .then(response => {
        if (response.ok) {

            // ✅ SAVE LOGIN STATE FIRST
            sessionStorage.setItem("loggedIn", "true");

            // ✅ THEN REDIRECT
            window.location.replace("/frontend/index.html");

        } else {
            document.getElementById("error").innerText =
                "Invalid username or password";
        }
    })
    .catch(() => {
        document.getElementById("error").innerText =
            "Server error. Try again.";
    });
}
