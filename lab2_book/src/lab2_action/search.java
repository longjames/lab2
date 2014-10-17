package lab2_action;


/*��search.jsp�л�ȡ��������       */
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class search extends ActionSupport{
	private static final long serialVersionUID = 1L;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	public String login()throws Exception{
		//�õ�context
		ActionContext context=ActionContext.getContext();
		HttpServletRequest request=ServletActionContext.getRequest();
		//ȡ�õ�¼ѧ��
		String name=lab2_book.author.getname("name");
		//��¼����
		//�Ƿ�Ϊ��
		if(no.isEmpty()||pwd.isEmpty())
		{
			return ERROR;
		}else {
			//�������ݿ�
			User  user=UserDao.isLogin(no, pwd);
			if(user==null)
			{
				return ERROR;
			}else {
				
				return SUCCESS;
			}			
		}		
	}
	public String delUser()throws Exception{
		ActionContext context=ActionContext.getContext();
		HttpServletRequest request=ServletActionContext.getRequest();
		String id=request.getParameter("id");
		UserDao.deleteUser(Integer.parseInt(id));
		List<User> userList=UserDao.getUserList();
		context.put("userlist", userList);
		
		return "user";
		
	}
	public String toAddUser()throws Exception{
		return "toAddUser";
	}
	public String addUser()throws Exception{
		ActionContext context=ActionContext.getContext();
		HttpServletRequest request=ServletActionContext.getRequest();
		String num=request.getParameter("num");
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		UserDao.addUser(num, name, pwd);
		List<User> userList=UserDao.getUserList();
		context.put("userlist", userList);
		
		
		return "user";
	}
	public String showUserList()throws Exception{
		ActionContext context=ActionContext.getContext();
	
		List<User> userList=UserDao.getUserList();
		context.put("userlist", userList);
		
		
		return "user";
	}

}

