
import com.example.examnsc.User;
import com.example.examnsc.UserModel;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

public class test {
    @Test
    public void finall() throws SQLException, ClassNotFoundException {
        User obj = new User("admin","123");
        User t = UserModel.Login(obj);
        System.out.println(t.toString());

    }
}
