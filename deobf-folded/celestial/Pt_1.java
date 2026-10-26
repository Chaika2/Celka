package celestial;

import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pt_1 extends Pv_1 implements PP {
   private static long[] id_case;
   private static short[] id_catch;
   public static Object[] id_break;
   private static String[] id_private;
   private static byte[] id_implements;
   private static boolean[] id_finally;
   public Object[] id_throws;

   public long id_byte() {
      this.id_final();
      return (Long)this.id_throws[1];
   }

   public Pt_1(C_class var1) {
      super(var1);
      this.id_final();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -376988152;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 44244996002526464L;
   }

   @Override
   public void id_class(j_1 var1) {
      this.id_final();
      if (var1.id_class() == (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[id_catch[0]] && this.id_catch()) {
         this.id_class();

         try {
            rgP_2 var2 = ((cq_3)b_.id_class[19]).id_implements().id_protected();
            if (var2 != null) {
               String var3 = var2.id_byte();
               if (!rql_3.id_break(var3) && var3.contains(id_private[0])) {
                  PI var4 = this.id_break(var3);
                  if (var4 != null) {
                     this.id_throws[id_catch[2]] = var4;
                  }
               }
            }

            for (String var15 : ((cq_3)b_.id_class[19]).id_new()) {
               if (var15.contains(id_private[1])) {
                  Matcher var5 = ((Pattern)id_break[1]).matcher(var15.replace(id_private[2], id_private[3]));
                  if (var5.find()) {
                     Long var11 = Long.parseLong(var5.group(1));
                     this.id_throws[1] = var11;
                  }
               } else if (var15.contains(id_private[4])) {
                  Matcher var16 = ((Pattern)id_break[2]).matcher(var15.replace(id_private[5], id_private[6]));
                  if (var16.find()) {
                     Long var12 = Long.parseLong(var16.group(1));
                     this.id_throws[2] = var12;
                  }
               }
            }
         } catch (Exception var13) {
         }
      }
   }

   @Override
   public void id_class(rrFK var1) {
      this.id_class();
   }

   public void id_class() {
      this.id_final();
      Object var5 = null;
      this.id_throws[id_catch[12]] = var5;
      Long var6 = id_case[0];
      this.id_throws[1] = var6;
      Long var7 = id_case[1];
      this.id_throws[2] = var7;
   }

   public long id_break() {
      this.id_final();
      return (Long)this.id_throws[2];
   }

   public PI id_break(String var1) {
      if (rql_3.id_break(var1)) {
         return null;
      } else {
         for (Pf_1 var3 : ((EnumMap)id_break[id_catch[15]]).keySet()) {
            Matcher var4 = ((Pattern)((EnumMap)id_break[id_catch[16]]).get(var3)).matcher(var1);
            if (var4.find()) {
               String var5 = var4.group(1);
               return new PI(var3, var5 != null ? var5 : id_private[7]);
            }
         }

         return null;
      }
   }

   private static void id_throws() {
      id_case = new long[4];
   }

   private static void id_finally() {
      id_private = new String[]{
         new String("Режим:"),
         new String("Монет"),
         new String(","),
         new String(""),
         new String("Токенов"),
         new String(","),
         new String(""),
         new String(""),
         new String("\\$ Монет: (\\d+)"),
         new String("⛁ Токенов: (\\d+)")
      };
   }

   private boolean id_catch() {
      return (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
            && (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         ? id_finally[3]
         : true;
   }

   private static void id_extends() {
      Object[] var0 = new Object[]{new Pw_1(Pf_1.class), Pattern.compile(id_private[8], 0), Pattern.compile(id_private[9])};
      id_break = var0;
   }

   private static void id_case() {
      id_catch = new short[]{0, 19, 0, 19, 1, 1, 2, 2, 1, 2, 1, 4, 0, 1, 2, 0, 0, 0, 1, 2};
   }

   private static void id_implements() {
      id_finally = new boolean[]{true, true, true, false, true, false, true, true};
   }

   public PI id_protected() {
      this.id_final();
      return (PI)this.id_throws[id_catch[17]];
   }

   public static String id_private(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{85, 88, -54, -72, 51, -1, -43, -67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_private() {
      id_implements = new byte[]{2, 3, 2, 3};
   }

   private void id_final() {
      if (this.id_throws == null) {
         this.id_throws = new Object[3];
         Object[] var1 = this.id_throws;
         var1[1] = id_case[2];
         var1[2] = id_case[3];
      }
   }
}
