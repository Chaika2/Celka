package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNd_1 extends rrwI_2 implements Comparable<rrNd_1>, rrNJ, rrNx_1 {
   public Object[] class_;
   private static float[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   private static String[] throws_;
   private static boolean[] catch_;

   public List<String> char_() {
      this.static_();
      return (List<String>)this.class_[14];
   }

   public void byte_(boolean var1) {
      this.static_();
      Boolean var6 = var1;
      this.class_[26] = var6;
   }

   public void byte_(int var1) {
      this.static_();
      Integer var6 = var1;
      this.class_[3] = var6;
   }

   public rrNd_1 byte_() {
      this.static_();
      return new rrNk_1()
         .class_((rdb_3)this.class_[0])
         .protected_((Integer)this.class_[1])
         .break_((Integer)this.class_[2])
         .native_((List<rrfA_2>)this.class_[4])
         .throws_((List<rrfA_2>)this.class_[5])
         .protected_((List<rrfA_2>)this.class_[6])
         .implements_((List<FuntimeEnchantment>)this.class_[7])
         .break_((List<FuntimeEnchantment>)this.class_[8])
         .finally_((List<FuntimeEnchantment>)this.class_[9])
         .case_((List<String>)this.class_[11])
         .private_((List<String>)this.class_[10])
         .extends_((List<String>)this.class_[12])
         .class_((List<String>)this.class_[13])
         .volatile_((List<String>)this.class_[14])
         .catch_((List<rrcT_2<?>>)this.class_[15])
         .class_((rdn_3)this.class_[16])
         .byte_((List<String>)this.class_[17])
         .break_((String)this.class_[18])
         .byte_((String)this.class_[19])
         .byte_((Boolean)this.class_[20])
         .class_((rrNw_1)this.class_[21])
         .class_((rrNX)this.class_[22])
         .protected_((Boolean)this.class_[25])
         .throws_((Boolean)this.class_[26])
         .class_((rrIk_1)this.class_[27])
         .byte_((Integer)this.class_[3])
         .class_((Boolean)this.class_[23])
         .break_((Boolean)this.class_[24])
         .break_();
   }

   public List<String> int_() {
      this.static_();
      return (List<String>)this.class_[12];
   }

   private static void long_() {
      break_ = new float[]{5.0F, 100.0F, 5.0F, 1.0F, 1.0F};
   }

   rrNd_1(rrNk_1 var1) {
      this.static_();
      rdb_3 var6 = (rdb_3)var1.class_[0];
      this.class_[0] = var6;
      Integer var7 = (Integer)var1.class_[2];
      this.class_[1] = var7;
      Integer var8 = (Integer)var1.class_[3];
      this.class_[2] = var8;
      List var9 = (List)var1.class_[5];
      this.class_[4] = var9;
      List var10 = (List)var1.class_[6];
      this.class_[5] = var10;
      List var11 = (List)var1.class_[7];
      this.class_[6] = var11;
      List var12 = (List)var1.class_[8];
      this.class_[7] = var12;
      List var13 = (List)var1.class_[9];
      this.class_[8] = var13;
      List var14 = (List)var1.class_[10];
      this.class_[9] = var14;
      List var15 = (List)var1.class_[11];
      this.class_[10] = var15;
      List var16 = (List)var1.class_[12];
      this.class_[11] = var16;
      List var17 = (List)var1.class_[13];
      this.class_[12] = var17;
      List var18 = (List)var1.class_[14];
      this.class_[13] = var18;
      List var19 = (List)var1.class_[15];
      this.class_[14] = var19;
      List var20 = (List)var1.class_[16];
      this.class_[15] = var20;
      rdn_3 var21 = (rdn_3)var1.class_[17];
      this.class_[16] = var21;
      List var22 = (List)var1.class_[18];
      this.class_[17] = var22;
      String var23 = (String)var1.class_[19];
      this.class_[18] = var23;
      String var24 = (String)var1.class_[20];
      this.class_[19] = var24;
      Boolean var25 = (Boolean)var1.class_[21];
      this.class_[20] = var25;
      rrNw_1 var26 = (rrNw_1)var1.class_[22];
      this.class_[21] = var26;
      rrNX var27 = (rrNX)var1.class_[23];
      this.class_[22] = var27;
      Boolean var28 = (Boolean)var1.class_[25];
      this.class_[25] = var28;
      rrIk_1 var29 = (rrIk_1)var1.class_[28];
      this.class_[27] = var29;
      Boolean var30 = (Boolean)var1.class_[26];
      this.class_[26] = var30;
      Integer var31 = (Integer)var1.class_[4];
      this.class_[3] = var31;
      Boolean var32 = (Boolean)var1.class_[27] == null ? ((rdb_3)this.class_[0]).extends_() : (Boolean)var1.class_[27];
      this.class_[23] = var32;
      Boolean var33 = (Boolean)var1.class_[24];
      this.class_[24] = var33;
      this.class_(new rrIk_1("Работать с Auto Parser", this.class_()).class_("auto_parser", (var1x, var2) -> this.class_(var1x.byte_())));
      if ((rrIk_1)this.class_[27] != null) {
         this.class_((Setting)((rrIk_1)this.class_[27]));
      }

      if ((Boolean)this.class_[23]) {
         this.class_(new rrIk_1("Проверять прочность", this.return_()).class_("durability", (var1x, var2) -> this.byte_(var1x.byte_())));
         this.class_(
               new rrIm_1("Мин. прочность в процентах", (float)this.public_(), 5.0F, 100.0F, 5.0F)
                  .class_("min_durability", (var1x, var2) -> this.byte_(var1x.byte_().intValue()))
            )
            .class_(() -> this.return_());
      }

      if (((rdb_3)this.class_[0]).implements_() > 1) {
         this.class_(
            new rrIm_1("Минимальное количество", (float)this.native_(), 1.0F, (float)((rdb_3)this.class_[0]).implements_(), 1.0F)
               .class_("min_count", (var1x, var2) -> this.class_(var1x.byte_().intValue()))
         );
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      this.static_();
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrNd_1 var2 = (rrNd_1)var1;
         return (rrNw_1)this.class_[21] != null && (rrNw_1)var2.class_[21] != null
            ? Objects.equals((rrNw_1)this.class_[21], (rrNw_1)var2.class_[21])
            : Objects.equals((String)this.class_[18], (String)var2.class_[18]);
      } else {
         return catch_[7];
      }
   }

   @Override
   public int hashCode() {
      this.static_();
      return (rrNw_1)this.class_[21] == null ? Objects.hashCode((String)this.class_[18]) : Objects.hashCode((rrNw_1)this.class_[21]);
   }

   public List<FuntimeEnchantment> this_() {
      this.static_();
      return (List<FuntimeEnchantment>)this.class_[9];
   }

   public List<FuntimeEnchantment> interface_() {
      this.static_();
      return (List<FuntimeEnchantment>)this.class_[8];
   }

   public void class_(rrfq_3 var1) {
      this.static_();
      this.class_[28] = var1;
   }

   public void class_(rrNw_1 var1) {
      this.static_();
      this.class_[21] = var1;
   }

   @Override
   public boolean class_() {
      this.static_();
      return (Boolean)this.class_[25];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-42, -58, 124, -13, -49, -59, -105, -87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rrIk_1 var1) {
      this.static_();
      this.class_[27] = var1;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8295465653232815669L;
   }

   public void class_(int var1) {
      this.static_();
      Integer var6 = var1;
      this.class_[2] = var6;
   }

   public void class_(boolean var1) {
      this.static_();
      Boolean var6 = var1;
      this.class_[25] = var6;
   }

   @Override
   public boolean class_(rrNw_1 var1, Predicate<rrcT_2<?>> var2) {
      this.static_();

      for (rrcT_2 var4 : (List)this.class_[15]) {
         if (var2 == null || var2.test(var4)) {
            rrfI_2 var5 = var4.class_(this, var1);
            if (!var5.byte_()) {
               return false;
            }
         }
      }

      return catch_[2];
   }

   public int class_(rrNd_1 var1) {
      this.static_();
      if (var1 == null) {
         throw new NullPointerException("otherItem is marked non-null but is null");
      } else if ((rrNw_1)this.class_[21] != null && (rrNw_1)var1.class_[21] != null) {
         rdb_3 var2 = ((rrNw_1)this.class_[21]).protected_().break_();
         rdb_3 var3 = ((rrNw_1)var1.class_[21]).protected_().break_();
         if (var2 == rdy_3.kL || var3 == rdy_3.kL) {
            return catch_[4];
         } else if (var2 != rdy_3.dJ && var3 != rdy_3.dJ) {
            int var4 = Math.abs((Integer)this.class_[1] - ((rrNw_1)this.class_[21]).case_());
            int var5 = Math.abs((Integer)var1.class_[1] - ((rrNw_1)var1.class_[21]).case_());
            return Integer.compare(var5, var4);
         } else {
            return catch_[5];
         }
      } else {
         return catch_[3];
      }
   }

   private static void default_() {
      protected_ = new short[]{
         0,
         0,
         2,
         1,
         3,
         2,
         5,
         4,
         6,
         5,
         7,
         6,
         8,
         7,
         9,
         8,
         10,
         9,
         11,
         10,
         12,
         11,
         13,
         12,
         14,
         13,
         15,
         14,
         16,
         15,
         17,
         16,
         18,
         17,
         19,
         18,
         20,
         19,
         21,
         20,
         22,
         21,
         23,
         22,
         25,
         25,
         28,
         27,
         26,
         26,
         4,
         3,
         27,
         0,
         27,
         23,
         24,
         24,
         27,
         27,
         23,
         0,
         0,
         0,
         1,
         2,
         4,
         5,
         6,
         7,
         8,
         9,
         11,
         10,
         12,
         13,
         14,
         15,
         16,
         17,
         18,
         19,
         20,
         21,
         22,
         25,
         26,
         27,
         3,
         23,
         24,
         15,
         25,
         21,
         21,
         21,
         21,
         21,
         1,
         21,
         1,
         21,
         21,
         21,
         18,
         18,
         21,
         21,
         21,
         18,
         21,
         28,
         28,
         0,
         1,
         1,
         2,
         4,
         5,
         6,
         7,
         8,
         9,
         11,
         10,
         12,
         13,
         14,
         15,
         16,
         17,
         18,
         19,
         20,
         20,
         21,
         22,
         25,
         26,
         26,
         27,
         27,
         3,
         3,
         2,
         23,
         24,
         28,
         28
      };
   }

   private static void short_() {
      throws_ = new String[]{
         new String("Работать с Auto Parser"),
         new String("auto_parser"),
         new String("Проверять прочность"),
         new String("durability"),
         new String("Мин. прочность в процентах"),
         new String("min_durability"),
         new String("Минимальное количество"),
         new String("min_count"),
         new String("otherItem is marked non-null but is null")
      };
   }

   private static void void_() {
      byte_ = new byte[]{29, 2, 3, 20, 23, 24, 25, 26};
   }

   @Nullable
   @Override
   public rrNw_1 break_() {
      this.static_();
      return (rrNw_1)this.class_[21];
   }

   public void break_(boolean var1) {
      this.static_();
      Boolean var6 = var1;
      this.class_[20] = var6;
   }

   public void break_(int var1) {
      this.static_();
      Integer var6 = var1;
      this.class_[1] = var6;
   }

   public boolean throws_() {
      this.static_();
      return (Boolean)this.class_[23];
   }

   public rrfq_3 finally_() {
      this.static_();
      return (rrfq_3)this.class_[28];
   }

   public rdb_3 catch_() {
      this.static_();
      return (rdb_3)this.class_[0];
   }

   public List<String> extends_() {
      this.static_();
      return (List<String>)this.class_[11];
   }

   public List<rrfA_2> goto_() {
      this.static_();
      return (List<rrfA_2>)this.class_[6];
   }

   public String case_() {
      this.static_();
      return (String)this.class_[18];
   }

   public rrNX continue_() {
      this.static_();
      return (rrNX)this.class_[22];
   }

   public int else_() {
      this.static_();
      return (Integer)this.class_[1];
   }

   public boolean implements_() {
      this.static_();
      return (Boolean)this.class_[24];
   }

   private static void import_() {
      catch_ = new boolean[]{true, false, true, false, false, false, true, false, true, false, false, false, false, false, false, false, false};
   }

   public List<rrcT_2<?>> instanceof_() {
      this.static_();
      return (List<rrcT_2<?>>)this.class_[15];
   }

   public List<rrfA_2> new_() {
      this.static_();
      return (List<rrfA_2>)this.class_[5];
   }

   public rdn_3 package_() {
      this.static_();
      return (rdn_3)this.class_[16];
   }

   public boolean return_() {
      this.static_();
      return (Boolean)this.class_[26];
   }

   public List<rrfA_2> super_() {
      this.static_();
      return (List<rrfA_2>)this.class_[4];
   }

   public List<FuntimeEnchantment> throw_() {
      this.static_();
      return (List<FuntimeEnchantment>)this.class_[7];
   }

   public List<String> try_() {
      this.static_();
      return (List<String>)this.class_[10];
   }

   public boolean while_() {
      this.static_();
      return (Boolean)this.class_[20];
   }

   private void static_() {
      if (this.class_ == null) {
         this.class_ = new Object[29];
         Object[] var1 = this.class_;
         var1[1] = 0;
         var1[2] = 0;
         var1[3] = 0;
         var1[20] = false;
         var1[23] = false;
         var1[24] = false;
         var1[25] = false;
         var1[26] = false;
      }
   }

   public int public_() {
      this.static_();
      return (Integer)this.class_[3];
   }

   public List<String> protected_() {
      this.static_();
      return (List<String>)this.class_[13];
   }

   private static int protected_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 731010327;
   }

   public List<String> private_() {
      this.static_();
      return (List<String>)this.class_[17];
   }

   public String abstract_() {
      this.static_();
      return (String)this.class_[19];
   }

   public rrIk_1 final_() {
      this.static_();
      return (rrIk_1)this.class_[27];
   }

   public String volatile_() {
      this.static_();
      String var1 = this.case_();
      return (rrfq_3)this.class_[28] == null ? var1 : ((rrfq_3)this.class_[28]).name() + ":" + var1;
   }

   @Override
   public String synchronized_() {
      return this.case_();
   }

   public int native_() {
      this.static_();
      return (Integer)this.class_[2];
   }
}
