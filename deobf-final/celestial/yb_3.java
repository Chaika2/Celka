package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class yb_3 {
   private final lD_2 class_;
   private static final yb_3 break_ = new yb_3();

   public lD_2 byte_() {
      return this.class_;
   }

   public yb_3(int var1) {
      this.class_ = new lD_2(var1);
   }

   public yb_3() {
      this(2097152);
   }

   public void class_(lD_2 var1) {
      if (var1.finally_ != null) {
         rrMh_1.class_(var1.finally_);
      }

      var1.finally_();
      yk_3.class_(var1);
   }

   public static yb_3 class_() {
      RenderSystem.assertThread(RenderSystem::isOnGameThreadOrInit);
      return break_;
   }

   public void break_() {
      this.class_(this.class_);
   }
}
