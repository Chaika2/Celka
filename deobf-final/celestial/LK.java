package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class LK extends Lo_1 {
   private final Vu_1 break_;
   private final rgP_2 byte_;
   private final LF protected_;
   private final LF throws_;

   LK(LR var1, Vu_1 var2, rgP_2 var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = new LD(this, 0, 0, 75, 20, var3, var2x -> this.class_.class_.class_ = var2, var1, var2, var3);
      this.throws_ = new LU(this, 0, 0, 50, 20, new rgn_3("controls.reset"), var2x -> {
         ((Qw_1)this.class_.native_.class_[20]).class_(var2, var2.private_(), var2.finally_());
         Vu_1.byte_();
      }, var1, var3);
   }

   @Override
   public boolean class_(double var1, double var3, int var5) {
      return this.protected_.class_(var1, var3, var5) || this.throws_.class_(var1, var3, var5);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      boolean var11 = this.class_.class_.class_ == this.break_;
      ((cm_3)this.class_.native_.class_[15]).byte_(var1, this.byte_, (float)(var4 + 90 - this.class_.throws_), (float)(var3 + var6 / 2 - 4), 16777215);
      this.throws_.volatile_ = var4 + 190;
      this.throws_.final_ = var3;
      this.throws_.int_ = !this.break_.volatile_();
      this.throws_.class_(var1, var7, var8, var10);
      this.protected_.volatile_ = var4 + 105;
      this.protected_.final_ = var3;
      this.protected_.break_(this.break_.native_());
      boolean var12 = false;
      if (!this.break_.extends_()) {
         for (Vu_1 var16 : ((Qw_1)this.class_.native_.class_[20]).f) {
            if (var16 != this.break_ && this.break_.byte_(var16)) {
               var12 = true;
               break;
            }
         }
      }

      if (var11) {
         this.protected_.break_(new rgN_2("> ").class_(this.protected_.C_().case_().class_(rgF_2.YELLOW)).break_(" <").class_(rgF_2.YELLOW));
      } else if (var12) {
         this.protected_.break_(this.protected_.C_().case_().class_(rgF_2.RED));
      }

      this.protected_.class_(var1, var7, var8, var10);
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      return this.protected_.break_(var1, var3, var5) ? true : this.throws_.break_(var1, var3, var5);
   }

   @Override
   public List<? extends cC_2> x_() {
      return ImmutableList.of(this.protected_, this.throws_);
   }
}
