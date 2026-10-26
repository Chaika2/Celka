package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Sz_1 implements Sm_1 {
   ;
   public Object[] fieldsdce61febeabf31e796c6d56c411faa28;
   private static long[] longsdce61febeabf31e796c6d56c411faa28;
   private static byte[] bytesdce61febeabf31e796c6d56c411faa28;
   private static boolean[] booleansdce61febeabf31e796c6d56c411faa28;
   private static short[] shortsdce61febeabf31e796c6d56c411faa28;
   public static Object[] staticFieldsdce61febeabf31e796c6d56c411faa28;
   private static String[] stringsdce61febeabf31e796c6d56c411faa28;

   public String byte_() {
      return (String)this.fieldsdce61febeabf31e796c6d56c411faa28[0];
   }

   private static long byte_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7062790116073304283L;
   }

   private static void int_() {
      booleansdce61febeabf31e796c6d56c411faa28 = new boolean[]{false, false, true, false, false, true, true};
   }

   private Sz_1(String var3, LongSupplier var4, LongSupplier var5, Set<xd_3> var6, Set<xd_3> var7) {
      this.volatile_();
      this.fieldsdce61febeabf31e796c6d56c411faa28[0] = var3;
      this.fieldsdce61febeabf31e796c6d56c411faa28[1] = var4;
      this.fieldsdce61febeabf31e796c6d56c411faa28[4] = var7;
      this.fieldsdce61febeabf31e796c6d56c411faa28[3] = var6;
      this.fieldsdce61febeabf31e796c6d56c411faa28[2] = var5;
   }

   private Sz_1(String var3, long var4, long var6, Set<xd_3> var8) {
      this(var3, () -> var4, () -> var6, var8, null);
   }

   private Sz_1(String var3, long var4, long var6, Set<xd_3> var8, Set<xd_3> var9) {
      this(var3, () -> var4, () -> var6, var8, var9);
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-87, 61, 32, -26, -83, -49, -23, -72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Set<xd_3> class_() {
      return (Set<xd_3>)this.fieldsdce61febeabf31e796c6d56c411faa28[3];
   }

   public static Sz_1 class_(Collection<xd_3> var0) {
      for (Sz_1 var4 : (Sz_1[])staticFieldsdce61febeabf31e796c6d56c411faa28[16]) {
         Set var5 = var4.class_();
         if (var5.equals(var0)) {
            return var4;
         }

         Set var6 = var4.catch_();
         if (var6 != null) {
            HashSet var7 = new HashSet(var5);
            var7.addAll(var6);
            if (var7.equals(var0)) {
               return var4;
            }
         }
      }

      return null;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 62726168;
   }

   public LongSupplier break_() {
      return (LongSupplier)this.fieldsdce61febeabf31e796c6d56c411faa28[2];
   }

   @Override
   public Stream<xd_3> throws_() {
      return ((Set)this.fieldsdce61febeabf31e796c6d56c411faa28[3]).stream();
   }

   private static void finally_() {
      stringsdce61febeabf31e796c6d56c411faa28 = new String[]{
         new String("DEFAULT"),
         new String("Обычный"),
         new String("DRAGON"),
         new String("Драконий"),
         new String("PEARL"),
         new String("Жемчужный"),
         new String("MYSTIC"),
         new String("Мистический"),
         new String("GHOST"),
         new String("Призрачный"),
         new String("NIGHTMARISH"),
         new String("Кошмарный"),
         new String("SPOOKY"),
         new String("Зловещий"),
         new String("LETHAL"),
         new String("Смертельный"),
         new String("CRUEL"),
         new String("Жестокий"),
         new String("ICY"),
         new String("Ледяной"),
         new String("INSIDIOUS"),
         new String("Коварный"),
         new String("CURSED"),
         new String("Проклятый"),
         new String("EXCRUCIATING"),
         new String("Мучительный"),
         new String("ROYAL"),
         new String("Царский"),
         new String("SINGULAR"),
         new String("Сингулярный"),
         new String("UNVOIDABLE"),
         new String("Неизбежный")
      };
   }

   public Set<xd_3> catch_() {
      return (Set<xd_3>)this.fieldsdce61febeabf31e796c6d56c411faa28[4];
   }

   private static void extends_() {
      shortsdce61febeabf31e796c6d56c411faa28 = new short[]{
         17, 0, 1, 4, 3, 2, 16, 3, 3, 0, 1, 2, 3, 4, 1, 4, 1, 4, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
      };
   }

   @Override
   public int case_() {
      return ((Set)this.fieldsdce61febeabf31e796c6d56c411faa28[3]).size();
   }

   private static void implements_() {
      bytesdce61febeabf31e796c6d56c411faa28 = new byte[]{
         16,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         14,
         15,
         2,
         2,
         3,
         3,
         4,
         4,
         5,
         5,
         6,
         6,
         7,
         7,
         8,
         8,
         9,
         9,
         10,
         10,
         11,
         11,
         12,
         12,
         13,
         13,
         14,
         14,
         15,
         15,
         17,
         16,
         5,
         18
      };
   }

   private static void package_() {
      Object[] var0 = new Object[]{
         new Sz_1("Обычный", 20L, 60L, Set.of((xd_3)xu_3.catch_, (xd_3)xu_3.OJ, (xd_3)xu_3.volatile_)),
         new Sz_1(
            "Драконий",
            () -> (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4] ? 30L : longsdce61febeabf31e796c6d56c411faa28[3],
            () -> (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4] ? 30L : longsdce61febeabf31e796c6d56c411faa28[3],
            Set.of((xd_3)xu_3.JL, (xd_3)xu_3.PD, (xd_3)xu_3.Jn, (xd_3)xu_3.bO, (xd_3)xu_3.JF, (xd_3)xu_3.Jc),
            Set.of((xd_3)xu_3.JJ)
         ),
         new Sz_1("Жемчужный", 20L, 60L, Set.of((xd_3)xu_3.EZ, (xd_3)xu_3.Ev, (xd_3)xu_3.Em)),
         new Sz_1("Мистический", 20L, 60L, Set.of((xd_3)xu_3.bq, (xd_3)xu_3.Bd, (xd_3)xu_3.bH, (xd_3)xu_3.by)),
         new Sz_1("Призрачный", 20L, 60L, Set.of((xd_3)xu_3.bX, (xd_3)xu_3.Bs, (xd_3)xu_3.sp, (xd_3)xu_3.sy)),
         new Sz_1("Кошмарный", 20L, 60L, Set.of((xd_3)xu_3.bY, (xd_3)xu_3.PD, (xd_3)xu_3.Ju)),
         new Sz_1("Зловещий", 20L, 60L, Set.of((xd_3)xu_3.Bq, (xd_3)xu_3.By, (xd_3)xu_3.Jc, (xd_3)xu_3.Bp), Set.of((xd_3)xu_3.BT)),
         new Sz_1("Смертельный", 20L, 60L, Set.of((xd_3)xu_3.bR, (xd_3)xu_3.JI, (xd_3)xu_3.SP, (xd_3)xu_3.bV)),
         new Sz_1("Жестокий", 20L, 60L, Set.of((xd_3)xu_3.Jd, (xd_3)xu_3.JJ, (xd_3)xu_3.Jy, (xd_3)xu_3.JL, (xd_3)xu_3.Ju)),
         new Sz_1("Ледяной", 20L, 60L, Set.of((xd_3)xu_3.Pt, (xd_3)xu_3.Ei, (xd_3)xu_3.PT)),
         new Sz_1("Коварный", 20L, 60L, Set.of((xd_3)xu_3.bR, (xd_3)xu_3.JI, (xd_3)xu_3.bg, (xd_3)xu_3.SP)),
         new Sz_1("Проклятый", 20L, 60L, Set.of((xd_3)xu_3.Jd, (xd_3)xu_3.Jn, (xd_3)xu_3.Jk, (xd_3)xu_3.Ju, (xd_3)xu_3.JL)),
         new Sz_1("Мучительный", 20L, 60L, Set.of((xd_3)xu_3.JJ, (xd_3)xu_3.Ju, (xd_3)xu_3.JL, (xd_3)xu_3.Ea)),
         new Sz_1("Царский", 20L, 60L, Set.of((xd_3)xu_3.JJ, (xd_3)xu_3.throws_, (xd_3)xu_3.case_, (xd_3)xu_3.BJ), Set.of((xd_3)xu_3.Jy)),
         new Sz_1("Сингулярный", 20L, 60L, Set.of((xd_3)xu_3.MR, (xd_3)xu_3.Ea)),
         new Sz_1("Неизбежный", 20L, 60L, Set.of((xd_3)xu_3.catch_, (xd_3)xu_3.OJ, (xd_3)xu_3.PD)),
         null,
         null
      };
      var0[16] = new Sz_1[]{
         (Sz_1)var0[0],
         (Sz_1)var0[1],
         (Sz_1)var0[2],
         (Sz_1)var0[3],
         (Sz_1)var0[4],
         (Sz_1)var0[5],
         (Sz_1)var0[6],
         (Sz_1)var0[7],
         (Sz_1)var0[8],
         (Sz_1)var0[9],
         (Sz_1)var0[10],
         (Sz_1)var0[11],
         (Sz_1)var0[12],
         (Sz_1)var0[13],
         (Sz_1)var0[14],
         (Sz_1)var0[15]
      };
      var0[17] = new Sz_1[]{
         (Sz_1)var0[0],
         (Sz_1)var0[1],
         (Sz_1)var0[2],
         (Sz_1)var0[3],
         (Sz_1)var0[4],
         (Sz_1)var0[5],
         (Sz_1)var0[6],
         (Sz_1)var0[7],
         (Sz_1)var0[8],
         (Sz_1)var0[9],
         (Sz_1)var0[10],
         (Sz_1)var0[11],
         (Sz_1)var0[12],
         (Sz_1)var0[13],
         (Sz_1)var0[14],
         (Sz_1)var0[15]
      };
      staticFieldsdce61febeabf31e796c6d56c411faa28 = var0;
   }

   public LongSupplier protected_() {
      return (LongSupplier)this.fieldsdce61febeabf31e796c6d56c411faa28[1];
   }

   private void volatile_() {
      if (this.fieldsdce61febeabf31e796c6d56c411faa28 == null) {
         this.fieldsdce61febeabf31e796c6d56c411faa28 = new Object[5];
         Object[] var1 = this.fieldsdce61febeabf31e796c6d56c411faa28;
      }
   }

   private static void native_() {
      longsdce61febeabf31e796c6d56c411faa28 = new long[]{
         30L,
         60L,
         30L,
         20L,
         20L,
         60L,
         20L,
         60L,
         20L,
         60L,
         20L,
         60L,
         20L,
         60L,
         20L,
         60L,
         20L,
         60L,
         20L,
         60L,
         20L,
         60L,
         20L,
         60L,
         20L,
         60L,
         20L,
         60L,
         20L,
         60L,
         20L,
         60L,
         20L,
         60L
      };
   }
}
