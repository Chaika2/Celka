package celestial;

public class rrOZ extends rrXE {
   public rrOZ() {
      super(aI_2.id_new, "drowned", 0.5F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      pq_3 var4 = new pq_3(var3);
      var4.id_throws = (tC_2<rEx_1>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public In_1 id_throws() {
      return new tC_2(0.0F, 0.0F, 64, 64);
   }
}
