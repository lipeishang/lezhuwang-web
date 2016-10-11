package lezhuwang.idao;
import lezhuwang.model.HelpInfo;
import java.util.List;

public interface IHelpInfoDAO{
	public int insert(HelpInfo hi);
	public int update(HelpInfo hi);
	public int delete(int ID);
	public List<HelpInfo> select(String condt); 
}
