package com.weng.inner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Outer
{
    private String name;
    private String name2="I'm Outer";

    public Inner getInner()
    {
        return new Inner();
    }

    @AllArgsConstructor
    @NoArgsConstructor
    public class Inner
    {
       private String name="I'm Inner";

        public void getName()
       {
           String name = null;
           System.out.println(name);
           System.out.println(this.name);
           System.out.println(name2);
           System.out.println(Outer.this.name);
       }
    }

    public class Tree
    {
        private Tree left;
        private Tree right;

        private Integer value;


    }
}
