package com.example.componentscandemo.child;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author huzijie
 * @version ChildBean.java, v 0.1 2023年11月28日 8:03 PM huzijie Exp $
 */
@Component
public class ChildBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hello Child");
        throw new RuntimeException("Not excepted bean");
    }
}
