package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLB implements MinecraftAccessor {
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;
   public Object[] id_class;
   public static Object[] id_break;

   public boolean id_byte() {
      return (Boolean)this.id_class[2];
   }

   public rrLB() {
      this.id_private();
   }

   static {
      ntfClinit();
   }

   public static rrLB id_class(rrLS var0, int var1, boolean var2) {
      ((rrLB)id_break[id_protected[0]]).id_class[id_protected[1]] = var0;
      rrLB var10000 = (rrLB)id_break[id_protected[2]];
      Integer var8 = var1;
      var10000.id_class[1] = var8;
      var10000 = (rrLB)id_break[id_protected[4]];
      Boolean var9 = var2;
      var10000.id_class[2] = var9;
      return (rrLB)id_break[id_protected[6]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, -92, 68, -87, 47, -93, -31, -119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1292419608;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6992274686413275500L;
   }

   public rrLS id_class() {
      return (rrLS)this.id_class[id_protected[14]];
   }

   public static void id_break(rrLS var0, int var1, boolean var2) {
      rrLB var3 = id_class(var0, var1, var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[7]]).id_finally().id_class(var3);
      if (!var3.id_byte()) {
         if (var1 == ((rrIF)ClickGuiTheme.id_class[id_protected[8]]).id_finally().id_byte()) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[9]]).id_byte().id_int();
         } else if (var1 == ((Qw_1)id_import.id_class[20]).T.id_int().id_break()) {
            id_import.id_break((rrfk_3)rrfk_3.id_throws[id_protected[11]]);
         }

         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[12]]).id_private().id_class(var1);
         ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_protected[13]]).id_class(var1);
      }
   }

   public int id_break() {
      return (Integer)this.id_class[1];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrLB()};
      id_break = var0;
   }

   private static void id_catch() {
      id_byte = new boolean[]{false, true, false, false, true};
   }

   private static void id_case() {
      id_protected = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 20, 0, 0, 0, 0, 1, 2};
   }

   private static void id_protected() {
      id_throws = new byte[]{3, 2};
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[1] = Integer.valueOf(id_byte[2]);
         var1[2] = id_byte[3];
      }
   }
}
