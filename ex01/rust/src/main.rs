fn main() {
    let mut sum = 0;
    for mut i in 1..1000 {
        if (i % 3 == 0) || (i % 5 == 0) {
            sum += i;
        }
    }
    println!("The sum of the divisors of 3 and 5 below 1000 is: {}", sum);
}