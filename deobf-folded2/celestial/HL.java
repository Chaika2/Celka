package celestial;

public class HL {
   private final QY id_class;
   private final HA id_break;
   private float id_byte;

   public HL(HA var1) {
      this.id_break = var1;
      this.id_class = QY.id_instanceof();
   }

   public void id_class(float var1, float var2) {
      this.id_byte += var1;
      this.id_break.id_class(this.id_class, rfU_2.id_class(this.id_byte * 0.001F) * 5.0F + 25.0F, -this.id_byte * 0.1F, var2);
   }
}
