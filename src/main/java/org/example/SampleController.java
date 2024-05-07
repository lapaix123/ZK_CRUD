package org.example;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;

import java.awt.*;

public class SampleController extends SelectorComposer<Component> {
    @Wire
    private Button submitButton;
    @Wire
    private Checkbox acceptTermBox;
    @Listen("onCheck = #acceptTermBox")
    public void changeSubmisionStatus(){
        if(acceptTermBox.isChecked()){
            submitButton.setDisabled(false);

        }else{
            submitButton.setDisabled(true);
        }
    }
}
