package celestial;

import org.lwjgl.openal.AL10;

public class NZ {
   private float id_class = 1.0F;
   private rjU_2 id_break = rjU_2.id_class;

   public void id_byte() {
      this.id_class(rjU_2.id_class);
      this.id_class(rje_3.id_throws, rje_3.id_protected);
   }

   public void id_class(rje_3 var1, rje_3 var2) {
      AL10.alListenerfv(4111, new float[]{var1.id_class(), var1.id_break(), var1.id_byte(), var2.id_class(), var2.id_break(), var2.id_byte()});
   }

   public void id_class(float var1) {
      AL10.alListenerf(4106, var1);
      this.id_class = var1;
   }

   public void id_class(rjU_2 var1) {
      this.id_break = var1;
      AL10.alListener3f(4100, (float)var1.id_break, (float)var1.id_byte, (float)var1.id_protected);
   }

   public rjU_2 id_class() {
      return this.id_break;
   }

   public float id_break() {
      return this.id_class;
   }
}
