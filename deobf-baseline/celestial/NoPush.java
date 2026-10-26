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
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_byte[0]]);
      this.id_super();
      rrIk_1 var5 = new rrIk_1(id_protected[2], id_throws[0]);
      this.id_break[id_byte[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_protected[3], id_throws[1]);
      this.id_break[id_byte[2]] = var6;
      rrIk_1 var7 = new rrIk_1(id_protected[4], id_throws[2]);
      this.id_break[id_byte[3]] = var7;
      rrIk_1 var8 = new rrIk_1(id_protected[5], id_throws[3]);
      this.id_break[id_byte[4]] = var8;
      rrIk_1 var9 = new rrIk_1(id_protected[6], id_throws[4]);
      this.id_break[id_byte[5]] = var9;
      rrIk_1 var10 = new rrIk_1(id_protected[7], id_throws[5]);
      this.id_break[id_byte[6]] = var10;
      String var10003 = id_protected[8];
      rrIk_1[] var10004 = new rrIk_1[id_catch[0]];
      var10004[id_throws[6]] = (rrIk_1)this.id_break[id_byte[7]];
      var10004[id_throws[7]] = (rrIk_1)this.id_break[id_byte[8]];
      var10004[id_catch[1]] = (rrIk_1)this.id_break[id_byte[9]];
      var10004[id_catch[2]] = (rrIk_1)this.id_break[id_byte[10]];
      var10004[id_catch[3]] = (rrIk_1)this.id_break[id_byte[11]];
      var10004[id_catch[4]] = (rrIk_1)this.id_break[id_byte[12]];
      this.id_class(new rrIc_1(var10003, var10004));
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
      if (var2 == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[id_byte[13]] && ((rrIk_1)this.id_break[id_byte[14]]).id_class()) {
         var1.id_class(id_throws[8]);
      } else if (var2 == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[id_byte[15]] && ((rrIk_1)this.id_break[id_byte[16]]).id_class()) {
         var1.id_class(id_throws[9]);
      } else if (var2 == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[id_byte[17]] && ((rrIk_1)this.id_break[id_byte[18]]).id_class()) {
         var1.id_class(id_throws[10]);
      } else if (var2 == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[id_byte[19]] && ((rrIk_1)this.id_break[id_byte[20]]).id_class()) {
         var1.id_class(id_throws[11]);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1450733010;
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_super();
      if (var1.id_class() instanceof rvQ_2 var2 && var2.id_break() == id_catch[5] && ((rrIk_1)this.id_break[id_byte[21]]).id_class()) {
         var1.id_class(id_throws[12]);
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
      return this.aJ_() && ((rrIk_1)this.id_break[id_byte[22]]).id_class() ? id_throws[13] : id_throws[14];
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
