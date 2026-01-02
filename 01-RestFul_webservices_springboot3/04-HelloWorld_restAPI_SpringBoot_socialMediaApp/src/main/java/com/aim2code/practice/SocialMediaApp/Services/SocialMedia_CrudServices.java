package com.aim2code.practice.SocialMediaApp.Services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.aim2code.practice.SocialMediaApp.BeanComponents.UserBean;

@Service
public interface SocialMedia_CrudServices {
	
	public List<UserBean> getAllUserDetails();
	
	public UserBean getIndividualUserDetails(int UserId);
	
	public UserBean CreateUser(UserBean userBean);
	
	public UserBean updateUser(UserBean userBean);

	public UserBean updateUser(UserBean user, int id);

	public String DeleteUser(Integer id);
}
