package com.example.componentscandemo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author huzijie
 * @version FatherBean.java, v 0.1 2023年11月28日 8:02 PM huzijie Exp $
 */
@Component
public class FatherBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hello Father");
    }
}
