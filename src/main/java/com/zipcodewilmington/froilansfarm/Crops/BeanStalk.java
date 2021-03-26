package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.EdiblePackage.SoyBean;

public class BeanStalk extends Crop<SoyBean> {
    SoyBean soyBean = new SoyBean();

    public SoyBean yieldProd() {
        return soyBean;
    }
}
