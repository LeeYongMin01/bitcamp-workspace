package com.eomcs.pms.filter;

import java.util.Map;
import com.eomcs.pms.handler.Request;

public interface CommandFilter {

  default void init(Map<String, Object> context) throws Exception {

  }
  void doFilter(Request request, FilterChain next) throws Exception;

  default void destroy() {

  }
}
