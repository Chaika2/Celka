package celestial;

public class rrhe_3 extends rrOY {
   public rrhe_3() {
      super(aI_2.U, "vindicator", 0.5F, new String[]{"vindication_illager"});
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      TG var4 = new TG(var3);
      var4.id_throws = (tK_2<T>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public In_1 id_throws() {
      return new tK_2(0.0F, 0.0F, 64, 64);
   }
}
