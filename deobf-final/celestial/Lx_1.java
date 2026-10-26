package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class Lx_1 implements LE, LS {
   private static final rgP_2 class_ = new rgn_3("spectatorMenu.team_teleport");
   private static final rgP_2 break_ = new rgn_3("spectatorMenu.team_teleport.prompt");
   private final List<LS> byte_ = Lists.newArrayList();

   @Override
   public rgP_2 byte_() {
      return class_;
   }

   public Lx_1() {
      QY var1 = QY.instanceof_();

      for (rnB_2 var3 : ((gm_3)var1.class_[56]).package_().throws_()) {
         this.byte_.add(new Ld_1(this, var3));
      }
   }

   @Override
   public void class_(Ml_1 var1, float var2, int var3) {
      QY.instanceof_().A().class_(cY_2.class_);
      ch_3.class_(var1, 0, 0, 16.0F, 0.0F, 16, 16, 256, 256);
   }

   @Override
   public List<LS> class_() {
      return this.byte_;
   }

   @Override
   public void class_(Lb_1 var1) {
      var1.class_(this);
   }

   @Override
   public rgP_2 break_() {
      return break_;
   }

   @Override
   public boolean protected_() {
      for (LS var2 : this.byte_) {
         if (var2.protected_()) {
            return true;
         }
      }

      return false;
   }
}
