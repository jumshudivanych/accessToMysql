package sandbox50572;

/**
 * Пример работы с MySql
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        JDBC jdbc = new JDBC("message java");
        jdbc.connectMySql();
    }
}
