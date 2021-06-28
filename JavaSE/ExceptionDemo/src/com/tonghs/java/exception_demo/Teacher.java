package com.tonghs.java.exception_demo;

/**
 * Teacher class
 *
 * @author tonghs
 * @date 2021/06/01
 */
public class Teacher {
    public void checkScore(int score) throws ScoreException {
        if (score< 0 || score > 100){
            throw new ScoreException("分数异常");
        }
    }
}
