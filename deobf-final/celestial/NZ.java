package celestial;

import org.lwjgl.openal.AL10;

public class NZ {
   private float class_ = 1.0F;
   private rjU_2 break_ = rjU_2.class_;

   public void byte_() {
      this.class_(rjU_2.class_);
      this.class_(rje_3.throws_, rje_3.protected_);
   }

   public void class_(rje_3 var1, rje_3 var2) {
      AL10.alListenerfv(4111, new float[]{var1.class_(), var1.break_(), var1.byte_(), var2.class_(), var2.break_(), var2.byte_()});
   }

   public void class_(float var1) {
      AL10.alListenerf(4106, var1);
      this.class_ = var1;
   }

   public void class_(rjU_2 var1) {
      this.break_ = var1;
      AL10.alListener3f(4100, (float)var1.break_, (float)var1.byte_, (float)var1.protected_);
   }

   public rjU_2 class_() {
      return this.break_;
   }

   public float break_() {
      return this.class_;
   }
}
