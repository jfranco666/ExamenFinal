package config.bd_test;
import java.sql.Connection;
import java.sql.SQLException;
import config.conectaBD;
public class test_conectaBD {
public static void main(String[] args) {
 conectaBD bd = new conectaBD();
try (Connection cn = bd.getConnection()) {
System.out.println("Conexion OK..");
} catch (SQLException e) {
System.out.println("Error: ");
System.out.println(e.getMessage());
}
}
}
