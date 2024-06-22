fun solution(products: List<String>, product: String) {
    products.forEachIndexed { index, element -> if (element == product) print("$index ") }
}