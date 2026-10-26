package celestial;

public class aF_2 implements MinecraftAccessor {
   private PX id_class = (PX)PX.id_class[0];

   public void id_class(float var1, float var2) {
      if (this.id_class == (PX)PX.id_class[0] && (cb_3)id_import.id_class[57] != null) {
         this.id_class = ((cb_3)id_import.id_class[57]).rO();
      }

      this.id_class.id_class(var1);
      this.id_class.id_byte(var2);
   }

   public PX id_class() {
      return this.id_class;
   }
}
