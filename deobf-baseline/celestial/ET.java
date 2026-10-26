package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum ET {
   private static boolean[] booleanse7e6e1fdc5523a20b4ec3fbb2a20d732;
   private static short[] shortse7e6e1fdc5523a20b4ec3fbb2a20d732;

   ET(int var3, int var4, int var5, boolean var6, boolean var7) {
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8920725945686226140L;
   }

   @Override
   public Ev_1 id_class(EZ var1, rU_2 var2) {
      Mr_1 var3 = new Mr_1();
      this.id_class(
         var1,
         (Integer)var2.id_break[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[0]],
         (Integer)var2.id_break[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[1]],
         (Integer)var2.id_break[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[2]],
         var3
      );
      return (Ev_1)(var3.id_class[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[3]]
            == var2.id_break[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[4]] - booleanse7e6e1fdc5523a20b4ec3fbb2a20d732[0]
         ? new GP(
            var1.id_break(),
            var2,
            new rU_2(
               (Integer)var3.id_class[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[5]],
               (Integer)var3.id_class[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[6]],
               (Integer)var3.id_class[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[7]]
            )
         )
         : new Gs_1(
            var1.id_break(),
            var2,
            new rU_2(
               (Integer)var3.id_class[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[8]],
               (Integer)var3.id_class[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[9]],
               (Integer)var3.id_class[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[10]]
            )
         ));
   }

   @Override
   public void id_class(EZ var1, int var2, int var3, int var4, Mr_1 var5) {
      GP.id_class(var1, var2, var3, var4, var2, var4 + booleanse7e6e1fdc5523a20b4ec3fbb2a20d732[1], var5);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1863189701;
   }

   private static void id_class() {
      booleanse7e6e1fdc5523a20b4ec3fbb2a20d732 = new boolean[]{true, true};
   }

   private static void id_break() {
      shortse7e6e1fdc5523a20b4ec3fbb2a20d732 = new short[]{0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 2};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-112, 64, 66, 1, -102, -54, -23, -34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
