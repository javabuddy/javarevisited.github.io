public class Book {
private final String name;
private final double price;public Star(String name, double price) {
this.name = name;
this.price = price;
}
@Override
public int hashCode() {
int hash = 7;
hash = 23 * hash + Objects.hashCode(this.name);
return hash;
}@Override
public boolean equals(Object obj) {
if (obj == null) {
return false;
}if (getClass() != obj.getClass()) {
return false;
}final Test other = (Test) obj;if (!Objects.equals(this.name, other.name)) {
   return false;
}if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
  return false;
}
return true;
}@Override
public String toString() {
 return "Test{" + "name=" + name + ", price=" + price + '}';
}}
