/**
 * 
 */
package lzw.idao;
import lzw.model.User;
import java.util.List;

/**
 * @author Administrator
 *
 */
public interface IUserDAO {
	public int insert(User user);
	public int update(User user);
	public int delete(int ID);
	public List<User> select(String condt);
	public boolean checkPwd(String userLoginName, String userPswd);
}