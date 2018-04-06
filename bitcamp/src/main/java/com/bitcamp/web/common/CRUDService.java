package com.bitcamp.web.common;

import java.util.Map;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component @Lazy 
public interface CRUDService {
	@FunctionalInterface
	public static interface Post{
		public void execute(Map<?, ?>paramMap);
	}
	public static interface Get{
		public Object execute(Map<?, ?>paramMap);
	}
	public static interface Count{
		public int execute(Map<?, ?>paramMap);
	}
	public static interface List{
		public List execute(Map<?, ?>paramMap);
	}
	public static interface Update{
		public void execute(Map<?, ?>paramMap);
	}
	public static interface Delete{
		public void execute(Map<?, ?>paramMap);
	}
}
