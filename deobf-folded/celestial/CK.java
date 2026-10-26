package celestial;

public class CK extends lO_2 {
   protected final Ch_1 id_class;
   private final float id_break;
   private float id_interface = 0.91F;
   private float id_char;
   private float id_abstract;
   private float id_long;
   private boolean id_float;

   public void id_byte(int var1) {
      this.id_char = (float)((var1 & 0xFF0000) >> 16) / 255.0F;
      this.id_abstract = (float)((var1 & 0xFF00) >> 8) / 255.0F;
      this.id_long = (float)((var1 & 0xFF) >> 0) / 255.0F;
      this.id_float = true;
   }

   protected CK(gm_3 var1, double var2, double var4, double var6, Ch_1 var8, float var9) {
      super(var1, var2, var4, var6);
      this.id_class = var8;
      this.id_break = var9;
   }

   @Override
   public CJ id_class() {
      return CJ.id_byte;
   }

   @Override
   public int id_break(float var1) {
      return 15728880;
   }

   public void id_break(int var1) {
      float var2 = (float)((var1 & 0xFF0000) >> 16) / 255.0F;
      float var3 = (float)((var1 & 0xFF00) >> 8) / 255.0F;
      float var4 = (float)((var1 & 0xFF) >> 0) / 255.0F;
      float var5 = 1.0F;
      this.id_class(var2 * 1.0F, var3 * 1.0F, var4 * 1.0F);
   }

   @Override
   public void id_case() {
      this.id_protected = this.id_catch;
      this.id_throws = this.id_private;
      this.id_case = this.id_implements;
      if (this.id_super++ >= this.id_this) {
         this.id_finally();
      } else {
         this.id_break(this.id_class);
         if (this.id_super > this.id_this / 2) {
            this.id_throws(1.0F - ((float)this.id_super - (float)(this.id_this / 2)) / (float)this.id_this);
            if (this.id_float) {
               this.id_synchronized = this.id_synchronized + (this.id_char - this.id_synchronized) * 0.2F;
               this.id_return = this.id_return + (this.id_abstract - this.id_return) * 0.2F;
               this.id_public = this.id_public + (this.id_long - this.id_public) * 0.2F;
            }
         }

         this.id_extends = this.id_extends + (double)this.id_break;
         this.id_class(this.id_finally, this.id_extends, this.id_native);
         this.id_finally = this.id_finally * (double)this.id_interface;
         this.id_extends = this.id_extends * (double)this.id_interface;
         this.id_native = this.id_native * (double)this.id_interface;
         if (this.id_volatile) {
            this.id_finally *= 0.7F;
            this.id_native *= 0.7F;
         }
      }
   }

   protected void id_case(float var1) {
      this.id_interface = var1;
   }
}
