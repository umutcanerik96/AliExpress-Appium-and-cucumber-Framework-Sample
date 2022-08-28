package PageObjectModel;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class search_Product_Page extends AbstractClass {

    @FindBy(id = "com.alibaba.aliexpresshd:id/tv_country_arrow")
    public static MobileElement regionButton;
    public static void clickRegionButton(){
        clickFunction(regionButton);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView")
    public static MobileElement theRegion;
    public static void clickTheRegion(){
        clickFunction(theRegion);
    }
    @FindBy(id = "com.alibaba.aliexpresshd:id/tv_continue")
    public static MobileElement continueBttn;
    public static MobileElement clickContinueBttn() {
        clickFunction(continueBttn);
    }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout")
    public static MobileElement searchBox;
    public static MobileElement clickSearchBox(){
        clickFunction(searchBox);
    }
    @FindBy(linkText = "")
    public static MobileElement sendKeysArea;
    public static MobileElement sendKeysOnArea(){
        sendKeysFunction(sendKeysArea,"Toy Story");
    }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.view.ViewGroup/android.view.View[5]")
    public static MobileElement searchButton;
    public static MobileElement clickSearchButton(){
        clickFunction(searchButton);
    }
    @FindBy(id = "com.alibaba.aliexpresshd:id/tv_buynow")
    public static MobileElement relatedProduct;
    public static MobileElement assertIsTheyAreRealeted(){
        assertationFunction(relatedProduct, "Toy Story");
    }
}
