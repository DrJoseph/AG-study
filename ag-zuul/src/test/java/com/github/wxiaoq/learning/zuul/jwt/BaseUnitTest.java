package com.github.wxiaoq.learning.zuul.jwt;

import com.github.wxiaoqi.learning.gate.APIGateBootstrap;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by ace on 2017/9/10.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = APIGateBootstrap.class)
@WebMvcTest
public class BaseUnitTest {
}
