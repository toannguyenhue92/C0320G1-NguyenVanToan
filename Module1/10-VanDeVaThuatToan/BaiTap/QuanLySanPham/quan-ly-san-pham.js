const textNewProduct = document.getElementById("textNewProduct");
const tableProducts = document.getElementById("tableProducts");

const products = [];

function displayTableProductsHTML() {
  let html = "<table><tr><th>Product Name</th></tr>";
  for (let index = 0; index < products.length; index++) {
    const product = products[index];
    html += `<tr><td>${product}</td>
    <td><button onclick="editProduct(${index})">Edit</button></td>
    <td><button onclick="deleteProduct(${index})">Delete</button></td>
    </tr>`;
  }
  html += "</table>";
  return html;
}

function displayProducts() {
  tableProducts.innerHTML = displayTableProductsHTML();
}

function addProduct() {
  const newProduct = textNewProduct.value.trim();
  if (newProduct.length > 0) {
    products.push(textNewProduct.value);
    displayProducts();
  }
}

function editProduct(index) {
  const newName = prompt("Enter new product's name:", products[index]).trim();
  if (newName.length > 0) {
    products[index] = newName;
    displayProducts();
  }
}

function deleteProduct(index) {
  if (confirm(`Delete product '${products[index]}'?`)) {
    products.splice(index, 1);
    displayProducts();
  }
}
