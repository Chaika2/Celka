package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class NoPush extends Module {
   private static short[] id_byte;
   private static String[] id_protected;
   public Object[] id_break;
   private static boolean[] id_throws;
   private static byte[] id_catch;

   public NoPush() {
      super("No Push", "Игнорирует отталкивание от\nчего-либо", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.id_super();
      rrIk_1 var5 = new rrIk_1("Блоки", true);
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Сущности", true);
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Удочки", true);
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1("Воду", false);
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Пузыри", false);
      this.id_break[4] = var9;
      rrIk_1 var10 = new rrIk_1("Границу", false);
      this.id_break[5] = var10;
      this.id_class(
         new rrIc_1(
            "Игнорировать",
            (rrIk_1)this.id_break[1],
            (rrIk_1)this.id_break[2],
            (rrIk_1)this.id_break[0],
            (rrIk_1)this.id_break[3],
            (rrIk_1)this.id_break[4],
            (rrIk_1)this.id_break[5]
         )
      );
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_byte = new short[]{3, 0, 1, 2, 3, 4, 5, 1, 2, 0, 3, 4, 5, 2, 0, 1, 1, 0, 3, 3, 4, 2, 5};
   }

   @EventTarget
   public void id_class(rrAx_1 var1) {
      this.id_super();
      rrAd_1 var2 = var1.id_class();
      if (var2 == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[2] && ((rrIk_1)this.id_break[0]).id_class()) {
         var1.id_class(true);
      } else if (var2 == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[1] && ((rrIk_1)this.id_break[1]).id_class()) {
         var1.id_class(true);
      } else if (var2 == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[0] && ((rrIk_1)this.id_break[3]).id_class()) {
         var1.id_class(true);
      } else if (var2 == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[3] && ((rrIk_1)this.id_break[4]).id_class()) {
         var1.id_class(true);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1450733010;
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_super();
      if (var1.id_class() instanceof rvQ_2 var2 && var2.id_break() == 31 && ((rrIk_1)this.id_break[2]).id_class()) {
         var1.id_class(true);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8946148932134659189L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{23, -36, 49, 52, 113, 68, -62, -11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_catch = new byte[]{6, 2, 3, 4, 5, 31, 6};
   }

   private static void id_else() {
      id_protected = new String[]{
         new String("No Push"),
         new String("Игнорирует отталкивание от\nчего-либо"),
         new String("Блоки"),
         new String("Сущности"),
         new String("Удочки"),
         new String("Воду"),
         new String("Пузыри"),
         new String("Границу"),
         new String("Игнорировать")
      };
   }

   public boolean id_new() {
      this.id_super();
      return this.aJ_() && ((rrIk_1)this.id_break[5]).id_class() ? true : id_throws[14];
   }

   private static void id_return() {
      id_throws = new boolean[]{true, true, true, false, false, false, false, true, true, true, true, true, true, true, false};
   }

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
      }
   }
}
