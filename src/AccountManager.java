import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountManager {



    private ResultSet getBalance(long account_number, String security_pin) {
        PreparedStatement


    }
     private int updateBalance(double balance balance, long account_number, String operation) throws SQLException {
        String debit_query = "UPDATE account SET balance = balance " + operation +
     }







    public void debit_money(long account_number) {
        input.nextLine();


        System.out.println("Введите PIN-код");
        String security_pin = input.nextLine;


        try{
            connection.setAutoCommit(false);
            if (account_number != 0) {
                getBalance((account_number, security_pin));
                PreparedStatement preparedStatement = connection.preparedStatement("SELECT * FROM account WHERE account_number = ? AND security_pin = ?")ж
                        preparedStatement.setLong(1, account_number);
                preparedStatement.setString(2, security_pin);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    System.out.println("Введите сумму: ");
                    double amount = input.nextDouble();
                    double current_balance = resultSet.getDouble("balance");
                    if (amount <= current_balance) {
                        String debit_query = "UPDATE account SET balance = balance - ? Where account_number = ?";
                        PreparedStatement preparedStatement1 = connection.preparedStatement(debit_query);
                        preparedStatement1.setDouble(1, amount);
                        preparedStatement1.setLong(2, account_number);
                        int row = preparedStatement1.executeUpdate();
                        if (row > 0) {
                            System.out.println("РУБЛИ: " + amount + " списано успешно");
                            connection.commit();
                            connection.setAutoCommit(true);
                            return;
                        } else {
                            System.out.println("Транзакция не удалась");
                            connection.rollback();
                            connection.setAutoCommit(true);
                        }
                    } else {
                        System.out.println("Недостаточный баланс");

                    } else {
                        System.out.println("НЕверный PIN-код");
                        }
                        }
                    }
                }
            }
    } catch (SQLException e) {
            e.printStackTrace();
        }
        connection.setAutoCommit(true);

    public void credit_money (long  account_number) {
        input.nextLine();
        s


        try {
            connection.setAutoCommit(false);
            if(account_number != 0) {
                PreparedStatement getPreparedStatement = connection.prepareStatement ("SELECT" +
        "* FROM account WHERE account_number = ?" AND ..."");
        getPreparedStatement.setLong(1, account_number);
        getPreparedStatement.setString(2, security_pin );
        Resultset resultSet = .....

        if (resultSet.next()){
        System.out.println("Введите сумму");
        double amount=input.nextDouble;
        String credit_query="UPDATE account SET balance = balance + ? ...."
        PreparedStatement

        setPreparedStatement.setLong(2,account_number);
        int row=set..
        if(row>0){
        System.out.println("Рубли :     зачислено успешно");
        connection.commit();
        connection.SetAutoCommit(true);
        }else{
        System.out.println("Транзакция не удалась");
        connection.commit();
        connection.SetAutoCommit(true);

        }
        } else {
        System.out.println("Неверный PIN- код");





        }

        }


        }
        }
        connection.SetAutoCommit(true);


public  void transfer_money(long sender_account_number) {
    input.nextLine();
        System.out.println("Введите PIN- код");
        String security_pin = input.nextLine();

        System.out.println("Введите номер счета получателя: ");
        long receiver_account_number=input.nextLong();

        try{
        connection.SetAutoCommit(false);


        if (receiver_account_number != 0 && receiver_account_number != 0 ) {
        System.out.println("Введите сумму: ");
            double amount = input.nextDouble();
            ResultSet resultSet = getBalance(sender_account_number, security_pin);
            double current_balance = resultSet.getDouble("balance")

            if (amount <= curren_balance ) {
                String debit_query = "UPDATE accountSET balancce = balance - ? WHERE account_number = ?";
                String credit_query = "UPDATE accountSET balancce = balance - ? WHERE account_number = ?";
        }
            PreparedStatement preparedStatement =


        } else {
            System.out.println("Неверный номер счета: ");


        }


        } catch (SQLException e) {
            e.printStackTrace();

        }

}

