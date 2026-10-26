package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class tm_3 extends In_1 {
   private final Iq_1 class_ = new Iq_1(64, 32, 0, 0).class_(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F);
   private final Iq_1 break_ = new Iq_1(64, 32, 16, 0).class_(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F);
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;
   private final Iq_1 catch_ = new Iq_1(64, 32, 12, 0).class_(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F);
   private final List<Iq_1> private_;

   public tm_3() {
      super(HU::break_);
      this.byte_ = new Iq_1(64, 32, 0, 10).class_(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F);
      this.protected_ = new Iq_1(64, 32, 12, 10).class_(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F);
      this.throws_ = new Iq_1(64, 32, 24, 10).class_(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      this.case_ = new Iq_1(64, 32, 24, 10).class_(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      this.private_ = ImmutableList.of(this.class_, this.break_, this.catch_, this.byte_, this.protected_, this.throws_, this.case_);
      this.class_.class_(0.0F, 0.0F, -1.0F);
      this.break_.class_(0.0F, 0.0F, 1.0F);
      this.catch_.catch_ = (float) (Math.PI / 2);
   }

   public void class_(float var1, float var2, float var3, float var4) {
      float var5 = (rfU_2.class_(var1 * 0.02F) * 0.1F + 1.25F) * var4;
      this.class_.catch_ = (float) Math.PI + var5;
      this.break_.catch_ = -var5;
      this.byte_.catch_ = var5;
      this.protected_.catch_ = -var5;
      this.throws_.catch_ = var5 - var5 * 2.0F * var2;
      this.case_.catch_ = var5 - var5 * 2.0F * var3;
      this.byte_.byte_ = rfU_2.class_(var5);
      this.protected_.byte_ = rfU_2.class_(var5);
      this.throws_.byte_ = rfU_2.class_(var5);
      this.case_.byte_ = rfU_2.class_(var5);
   }

   @Override
   public void class_(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.break_(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void break_(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.private_.forEach(var8x -> var8x.class_(var1, var2, var3, var4, var5, var6, var7, var8));
   }
}
