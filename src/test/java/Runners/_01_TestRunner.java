package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature"},// buraya feature files in path yolunu yazıyoruz
        glue = {"StepDefinitions"} // Step dedfitinons ın klasörü adı yazılıyor.
        ,plugin= {"json:target/cucumber/cucumber.json"}
)
public class _01_TestRunner extends AbstractTestNGCucumberTests {
    // Bu class tiplerine Runner Class lar denir
}
// features pathlerinin alınması : ilgili feature dosyasının üzerinde
// sağ tuş -> copypath/refenrence seçildikten sonra çıkan seçeneklerden
// "content root" seçeneği ile uygun path alınmış olur.