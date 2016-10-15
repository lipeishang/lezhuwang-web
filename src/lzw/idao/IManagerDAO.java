package lzw.idao;
import lzw.model.Manager;
import java.util.List;

public interface IManagerDAO{
	public int insert(Manager mg);
	public int update(Manager mg);
	public int delete(int ID);
	public List<Manager> select(String condt); 
}
