package celestial;

public class Hp_1 extends Hl_1 {
   public Hp_1(boolean var1) {
      super("diffuse_lighting", () -> {
         if (var1) {
            HF.class_();
         }
      }, () -> {
         if (var1) {
            HF.break_();
         }
      }, var1);
   }
}
