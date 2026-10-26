package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SD implements D, PP {
   private static boolean[] id_throws;
   public Object[] id_class;
   public static Object[] id_break;
   private static String[] id_case;
   private static short[] id_catch;
   private static byte[] id_private;

   private static void id_byte() {
      id_catch = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};
   }

   public SD(C_case var1) {
      this.id_protected();
      F var6 = var1.id_switch();
      this.id_class[id_catch[0]] = var6;
      var1.s().id_class(this);
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_case = new String[]{
         new String("> %s"),
         new String("Click to rerun command"),
         new String("help"),
         new String("set toggle %s"),
         new String("set %s"),
         new String("set %s %s"),
         new String("true"),
         new String("false"),
         new String("false"),
         new String("true")
      };
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{5, 20, 116, -24, 33, -41, -67, 99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(f_1 var1) {
      if ((Boolean)((C_private)id_break[id_catch[17]]).l.id_class[id_catch[18]]) {
         String var2 = (String)var1.id_class[id_catch[19]];
         String var3 = (String)((C_private)id_break[id_catch[20]]).id_protected.id_class[id_catch[21]];
         if (var2.startsWith(var3)) {
            String var4 = var2.substring(var3.length());
            List var5 = sG_2.id_class(var4, id_throws[12]);
            Stream var6 = this.id_private(var4);
            if (var5.size() == id_throws[13]) {
               var6 = var6.map(var1x -> var3 + var1x);
            }

            String[] var7 = var6.toArray(String[]::new);
            if (var7.length > 0) {
               var1.id_class[id_catch[22]] = var7;
            }
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9004151735521084422L;
   }

   @Override
   public void id_class(C var1) {
      String var2 = var1.id_class();
      String var3 = (String)((C_private)id_break[id_catch[1]]).id_protected.id_class[id_catch[2]];
      boolean var4 = var2.startsWith(C_throw.id_class);
      if (var2.startsWith(var3)) {
         var1.id_break();
         String var5 = var2.substring(var4 ? C_throw.id_class.length() : var3.length());
         if (!this.id_break(var5) && !var5.trim().isEmpty()) {
            new N(EJ.id_throws(var5).id_class()).id_class(null, null);
         }
      }
   }

   private void id_class(String var1, String var2) {
      if ((Boolean)((C_private)id_break[id_catch[3]]).rt.id_class[id_catch[4]]) {
         String var3 = var1 + var2;
         String var4 = ((C_private)id_break[id_catch[5]]).rp.id_class[id_catch[6]] ? var1 + " ..." : var3;
         String var10002 = id_case[0];
         Object[] var10003 = new Object[id_throws[0]];
         var10003[id_throws[1]] = var4;
         rVe_1 var5 = new rVe_1(String.format(var10002, var10003));
         var5.id_class(
            var5.id_class()
               .id_class(rgF_2.WHITE)
               .id_class(new rgy_3(rgp_3.id_class, new rgN_2(id_case[1])))
               .id_class(new rgl_3(rgH_2.RUN_COMMAND, C_throw.id_class + var3))
         );
         rVi_1[] var10001 = new rVi_1[id_throws[2]];
         var10001[id_throws[3]] = var5;
         this.id_class(var10001);
      }
   }

   public boolean id_break(String var1) {
      if (var1.isEmpty()) {
         return this.id_break(id_case[2]);
      } else {
         rqj_3 var2 = EJ.id_throws(var1);
         String var3 = (String)var2.id_class();
         String var4 = var1.substring(((String)var2.id_class()).length());
         sS_2 var5 = new sS_2((F)this.id_class[id_catch[7]], (List<C_import>)var2.id_break());
         if (!var5.id_final()) {
            C_extends var6 = (C_extends)((Map)((C_private)id_break[id_catch[8]]).Pj[id_catch[9]]).get(var3.toLowerCase(Locale.US));
            if (var6 != null) {
               this.id_class(var3, var4);
               if (var6.id_byte() == Boolean.class) {
                  F var10000 = (F)this.id_class[id_catch[10]];
                  String var10001 = id_case[3];
                  Object[] var10002 = new Object[id_throws[4]];
                  var10002[id_throws[5]] = var6.id_protected();
                  var10000.id_class(String.format(var10001, var10002));
               } else {
                  F var11 = (F)this.id_class[id_catch[11]];
                  String var13 = id_case[4];
                  Object[] var15 = new Object[id_throws[6]];
                  var15[id_throws[7]] = var6.id_protected();
                  var11.id_class(String.format(var13, var15));
               }

               return id_throws[8];
            }
         } else if (var5.id_case()) {
            for (C_extends var7 : (List)((C_private)id_break[id_catch[12]]).Pj[id_catch[13]]) {
               if (!Pd_1.id_throws(var7) && var7.id_protected().equalsIgnoreCase((String)var2.id_class())) {
                  this.id_class(var3, var4);

                  try {
                     F var12 = (F)this.id_class[id_catch[14]];
                     String var14 = id_case[5];
                     Object[] var16 = new Object[id_private[0]];
                     var16[id_throws[9]] = var7.id_protected();
                     var16[id_throws[10]] = var5.id_extends();
                     var12.id_class(String.format(var14, var16));
                  } catch (Q var9) {
                  }

                  return id_throws[11];
               }
            }
         }

         if (((F)this.id_class[id_catch[15]]).id_break((String)var2.id_class()) != null) {
            this.id_class(var3, var4);
         }

         return ((F)this.id_class[id_catch[16]]).id_break(var2);
      }
   }

   private static void id_break() {
      Object[] var0 = new Object[]{C_throws.id_break()};
      id_break = var0;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1534519006;
   }

   private static void id_throws() {
      id_private = new byte[]{2, 2, 2, 2};
   }

   private static void id_case() {
      id_throws = new boolean[]{
         true, false, true, false, true, false, true, false, true, false, true, true, true, true, true, true, false, true, false, true, false, true, true
      };
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[21]];
         Object[] var1 = this.id_class;
      }
   }

   public Stream<String> id_private(String var1) {
      try {
         List var2 = sG_2.id_class(var1, id_throws[14]);
         sS_2 var3 = new sS_2((F)this.id_class[id_catch[23]], var2);
         if (var3.id_catch(id_private[1])) {
            if (var3.id_case(id_throws[15])) {
               return new v_1().id_class((F)this.id_class[id_catch[24]]).id_byte().id_class(var3.id_extends()).id_protected();
            }

            C_extends var4 = (C_extends)((Map)((C_private)id_break[id_catch[25]]).Pj[id_catch[26]]).get(var3.id_extends().toLowerCase(Locale.US));
            if (var4 != null && !Pd_1.id_throws(var4)) {
               if (var4.id_byte() == Boolean.class) {
                  v_1 var5 = new v_1();
                  if ((Boolean)var4.id_class[id_catch[27]]) {
                     String[] var10001 = new String[id_private[2]];
                     var10001[id_throws[16]] = id_case[6];
                     var10001[id_throws[17]] = id_case[7];
                     var5.id_break(var10001);
                  } else {
                     String[] var7 = new String[id_private[3]];
                     var7[id_throws[18]] = id_case[8];
                     var7[id_throws[19]] = id_case[9];
                     var5.id_break(var7);
                  }

                  return var5.id_class(var3.id_extends()).id_protected();
               }

               return Stream.of(Pd_1.id_break(var4));
            }
         }

         return ((F)this.id_class[id_catch[28]]).id_byte(var1);
      } catch (Q var6) {
         return Stream.empty();
      }
   }
}
