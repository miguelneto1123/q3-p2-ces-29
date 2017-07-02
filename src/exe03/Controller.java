package exe03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Controller {
	private Object model;
	private Object view;

	public Controller(Object model, Object view) {
		this.model = model;
		this.view = view;
	}

	public void setName(String name) {
		Method method;
		try {
			method = model.getClass().getMethod("setName", String.class);
			method.invoke(model, name);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		Method method;
		try {
			method = model.getClass().getMethod("getName");
			return (String) method.invoke(model);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void setRollNo(String rollNo) {
		Method method;
		try {
			method = model.getClass().getMethod("setRollNo", String.class);
			method.invoke(model, rollNo);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	public String getRollNo() {
		Method method;
		try {
			method = model.getClass().getMethod("getRollNo");
			return (String) method.invoke(model);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void updateView() {
		Method method;
		try {
			String name = model.getClass().toString().split("exe03.")[1];
			String methodName = "print"+name+"Details";
			method = view.getClass().getMethod(methodName, String.class, String.class);
			method.invoke(view,this.getName(),this.getRollNo());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
