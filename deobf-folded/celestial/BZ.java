package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BZ extends Pv_1 {
   private static byte[] id_protected;
   public static Object[] id_break;
   private static short[] id_throws;
   private static String[] id_case;
   public Object[] id_byte;
   private static boolean[] id_catch;

   private static void id_byte() {
      id_throws = new short[]{0, 1, 4, 0, 0, 0, 1, 4, 0, 0, 0, 5, 0, 0};
   }

   public BZ(C_class var1) {
      super(var1);
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_protected = new byte[]{2, 3, 4, 5};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7669122442146643559L;
   }

   @Override
   public void id_class(rrLh_1 var1) {
      this.id_protected();
      if (var1.id_protected() == null && (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
         if ((Boolean)this.id_byte[id_throws[8]]) {
            Matcher var2 = ((Pattern)id_break[id_throws[9]]).matcher(var1.id_class());
            if (var2.find()) {
               String var3 = var2.group(1);
               String var4 = var2.group(2);
               String var5 = var2.group(3);
               String var6 = var2.group(4);
               String var7 = var2.group(5);
               ((rrvu_1)rrvu_1.staticFields795d62f6fe74334786edf14455ec3bfd[id_throws[10]]).id_class((rrZr_1)rrQJ.id_class[5], var6, var7, var5, var4, var3);
               MinecraftAccessor.a_("Вы были забанены за " + var6, id_catch[5]);
               Boolean var12 = id_catch[6];
               this.id_byte[id_throws[12]] = var12;
            }
         }
      }
   }

   @Override
   public void id_class(rrFK var1) {
      this.id_protected();
      super.id_class(var1);
      Boolean var6 = id_catch[7];
      this.id_byte[id_throws[13]] = var6;
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_protected();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[0]]) {
         if ((rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
            return;
         }

         PI var2 = ((C_class)this.id_class[id_throws[3]]).id_native().id_protected();
         boolean var3 = var2 != null && var2.id_class().id_break() ? true : id_catch[1];
         boolean var4 = ((C_class)this.id_class[id_throws[4]]).id_synchronized().id_class();
         Boolean var9 = !var3 && !var4 ? id_catch[3] : true;
         this.id_byte[id_throws[5]] = var9;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 519948433;
   }

   private static void id_break() {
      id_catch = new boolean[]{true, false, true, false, true, false, false, false, false, true, false, false, true};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{104, -47, 14, -121, 37, 14, -125, -37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{Pattern.compile(id_case[0])};
      id_break = var0;
   }

   private static void id_case() {
      id_case = new String[]{
         new String(
            "Вы были кикнуты с сервера (.*?):[\\s\\S]*?Бан выдан: (.*)\\s+Бан от: (.*)\\s+Ваш ник: .*\\s+По причине: ([\\s\\S]*?)\\s+Разбан через: (.*)"
         )
      };
   }

   private void id_protected() {
      if (this.id_byte == null) {
         this.id_byte = new Object[1];
         Object[] var1 = this.id_byte;
         var1[id_catch[10]] = id_catch[11];
      }
   }
}
