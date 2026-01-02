package com.aim2code.practice.SocialMediaApp.Services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
import com.aim2code.practice.SocialMediaApp.BeanComponents.UserBean;
import jakarta.annotation.PostConstruct;

@Component
public class SocialMedia_CrudServices_Implemantation implements SocialMedia_CrudServices{

	private int UserId=1; 
	
	private List<UserBean> objUserBean = new ArrayList<UserBean>();
	
	@PostConstruct
	public void postInitialization()
	{
		objUserBean.add(new UserBean(UserId++,"Vijay",LocalDateTime.now().minusYears(2)));
		objUserBean.add(new UserBean(UserId++,"Naveen",LocalDateTime.now().minusYears(3)));
		objUserBean.add(new UserBean(UserId++,"Sushanth",LocalDateTime.now().minusYears(1)));
		objUserBean.add(new UserBean(UserId++,"Abhi",LocalDateTime.now()));
	}
	@Override
	public List<UserBean> getAllUserDetails() {
		// TODO Auto-generated method stub
		return objUserBean;
	}
	@Override
	public UserBean getIndividualUserDetails(int UserId) {
		// TODO Auto-generated method stub
		Optional<UserBean> userDetail = objUserBean.stream().filter(user -> user.getUserId()==UserId).findFirst();
		return userDetail.get();
	}
	@Override
	public UserBean CreateUser(UserBean userBean) {
		// TODO Auto-generated method stub
		userBean.setUserId(UserId++);

	    objUserBean.add(userBean);

	    return userBean;
	}
	@Override
	public UserBean updateUser(UserBean userBean) {
		
		Optional<UserBean> userDetail = objUserBean.stream().filter(user -> user.getUserId()==userBean.getUserId()).findFirst();
		if(userDetail.get() != null) {
		userDetail.get().setUserId(userBean.getUserId());
		userDetail.get().setName(userBean.getName());
		userDetail.get().setDateTime(userBean.getDateTime());
		}
		return userDetail.get();
	}
	@Override
	public UserBean updateUser(UserBean userBean, int id) {
		// TODO Auto-generated method stub
		Optional<UserBean> userDetail = objUserBean.stream().filter(usr -> usr.getUserId()==id).findFirst();
		if(userDetail.get() != null) {
			userDetail.get().setUserId(id);
			if(userBean.getName()!=null)
			userDetail.get().setName(userBean.getName());
			if(userBean.getDateTime()!=null)
			userDetail.get().setDateTime(userBean.getDateTime());
			}
			return userDetail.get();
	}
	@Override
	public String DeleteUser(Integer id) {
		// TODO Auto-generated method stub
		Optional<UserBean> userDetail = objUserBean.stream().filter(usr -> usr.getUserId().equals(id)).findFirst();
		if(userDetail.get() != null) {
			objUserBean.remove(userDetail.get());
		}
		return "User Deleted Successfully";
	}

}
