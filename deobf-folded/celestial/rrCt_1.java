package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCt_1 extends rrTF<Velocity> {
   private static boolean[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;
   private static String[] id_case;
   private static float[] id_catch;

   private static void id_byte() {
      id_byte = new byte[]{2, 31, 2};
   }

   public rrCt_1(Velocity var1) {
      super(var1);
      this.id_case();
      rrIm_1 var6 = new rrIm_1(id_case[0], 50.0F, id_catch[1], 100.0F, 1.0F);
      this.id_class[id_protected[0]] = var6;
      rrIm_1 var7 = new rrIm_1(id_case[1], 50.0F, id_catch[5], 100.0F, 1.0F);
      this.id_class[1] = var7;
      Setting[] var10001 = new Setting[2];
      var10001[id_break[0]] = ((rrIm_1)this.id_class[id_protected[2]]).id_class(() -> var1.id_new() == this ? true : id_break[6]);
      var10001[1] = ((rrIm_1)this.id_class[1]).id_class(() -> var1.id_new() == this ? true : id_break[4]);
      var1.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8052270945812747818L;
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_case();
      ruS_2 var2 = var1.id_class();
      if (var2 instanceof rvc_3 var3) {
         if ((cb_3)id_import.id_class[57] != null && var3.id_break() == ((cb_3)id_import.id_class[57]).V()) {
            var3.id_class((int)((float)var3.id_byte() * (((rrIm_1)this.id_class[id_protected[6]]).id_byte() / 100.0F)));
            var3.id_break((int)((float)var3.id_protected() * (((rrIm_1)this.id_class[1]).id_byte() / 100.0F)));
            var3.id_byte((int)((float)var3.id_throws() * (((rrIm_1)this.id_class[id_protected[8]]).id_byte() / 100.0F)));
         }
      } else if (var2 instanceof rvu_3 var4) {
         var4.id_class((float)((int)(var4.id_break() * (((rrIm_1)this.id_class[id_protected[9]]).id_byte() / 100.0F))));
         var4.id_break((float)((int)(var4.id_byte() * (((rrIm_1)this.id_class[1]).id_byte() / 100.0F))));
         var4.id_byte((float)((int)(var4.id_protected() * (((rrIm_1)this.id_class[id_protected[11]]).id_byte() / 100.0F))));
      } else if (var2 instanceof rvQ_2 var5 && var5.id_break() == 31) {
         var1.id_class(true);
      }
   }

   private static void id_class() {
      id_catch = new float[]{50.0F, 0.0F, 100.0F, 1.0F, 50.0F, 0.0F, 100.0F, 1.0F, 100.0F, 100.0F, 100.0F, 100.0F, 100.0F, 100.0F};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 773528278;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-100, 77, 86, -106, 116, -74, 92, 100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new boolean[]{false, true, true, true, false, true, false};
   }

   private static void id_throws() {
      id_protected = new short[]{0, 1, 0, 1, 57, 57, 0, 1, 0, 0, 1, 0};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
      }
   }

   private static void id_protected() {
      id_case = new String[]{new String("Горизонтально"), new String("Вертикально")};
   }
}
