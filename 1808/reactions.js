// Get elements
const marginSlider = document.querySelector('input[name="Margin"]');
const borderSlider = document.querySelector('input[name="Border"]');
const paddingSlider = document.querySelector('input[name="Padding"]');

const outer = document.querySelector('.outerContainer');
const inner = document.querySelector('.Container');
const content = document.querySelector('.innerContainer');

// Create output labels (instead of plain text "50px")
const marginLabel = document.querySelector('.menu1').lastChild;
const borderLabel = document.querySelector('.menu2').lastChild;
const paddingLabel = document.querySelector('.menu3').lastChild;

// Initialize default values
marginSlider.value = 50;
borderSlider.value = 10;
paddingSlider.value = 30;

marginLabel.textContent = marginSlider.value + "px";
borderLabel.textContent = borderSlider.value + "px";
paddingLabel.textContent = paddingSlider.value + "px";

// 🔹 Update margin dynamically
marginSlider.addEventListener("input", () => {
    outer.style.marginTop = marginSlider.value + "px";
    marginLabel.textContent = marginSlider.value + "px";
});

// 🔹 Update border dynamically
borderSlider.addEventListener("input", () => {
    outer.style.borderWidth = borderSlider.value + "px";
    borderLabel.textContent = borderSlider.value + "px";
});

// 🔹 Update padding dynamically
paddingSlider.addEventListener("input", () => {
    inner.style.padding = paddingSlider.value + "px";
    paddingLabel.textContent = paddingSlider.value + "px";
});
