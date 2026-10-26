package celestial;

import it.unimi.dsi.fastutil.longs.Long2ByteLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class rrxF_2 {
   private xc_3 class_;
   private rfH_2 break_;
   private int byte_ = -1;
   private int protected_ = -1;
   private int throws_ = -1;
   private int case_ = -1;
   private float[] catch_ = new float[rpr_3.VALUES.length * 2];
   private BitSet private_ = new BitSet(3);
   private lw_3 implements_ = new lw_3();
   private rrGi_1 finally_ = null;
   private boolean[] extends_ = null;
   private boolean[] native_ = null;
   private boolean[] volatile_ = null;
   private rpr_3[] final_ = null;
   private List<wK_2> package_ = new ArrayList<>();
   private List<wK_2> int_ = new ArrayList<>();
   private wK_2[] new_ = new wK_2[1];
   private wK_2[] continue_ = new wK_2[2];
   private wK_2[] super_ = new wK_2[3];
   private wK_2[] this_ = new wK_2[4];
   private Hv_1 else_ = null;
   private rrJp_1[] synchronized_ = new rrJp_1[HU.s.length];
   private boolean return_ = false;
   private Long2ByteLinkedOpenHashMap public_ = new Long2ByteLinkedOpenHashMap();
   private static final int goto_ = -1;
   private static final int while_ = 0;
   private static final int try_ = 1;

   public float[] byte_() {
      return this.catch_;
   }

   public boolean int_() {
      return this.return_;
   }

   public rrxF_2(xc_3 var1, rfH_2 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public wK_2[] class_(wK_2 var1, wK_2 var2) {
      this.continue_[0] = var1;
      this.continue_[1] = var2;
      return this.continue_;
   }

   public void class_(xc_3 var1, rfH_2 var2) {
      if (this.class_ != var1 || this.break_ != var2) {
         this.class_ = var1;
         this.break_ = var2;
         this.byte_ = -1;
         this.protected_ = -1;
         this.throws_ = -1;
         this.case_ = -1;
         this.private_.clear();
      }
   }

   public List<wK_2> class_(wK_2[] var1) {
      this.int_.clear();
      if (var1 != null) {
         for (int var2 = 0; var2 < var1.length; var2++) {
            wK_2 var3 = var1[var2];
            this.int_.add(var3);
         }
      }

      return this.int_;
   }

   public void class_(Hv_1 var1) {
      this.else_ = var1;
   }

   public rpr_3[] class_(rpr_3 var1, rpr_3 var2, rpr_3 var3, rpr_3 var4) {
      rpr_3[] var5 = this.native_();
      var5[0] = var1;
      var5[1] = var2;
      var5[2] = var3;
      var5[3] = var4;
      return var5;
   }

   public rrJp_1 class_(HU var1) {
      rrJp_1 var2 = this.synchronized_[var1.protected_()];
      if (var2 == null) {
         var2 = new rrJp_1();
         this.synchronized_[var1.protected_()] = var2;
      }

      return var2;
   }

   public wK_2[] class_(wK_2 var1, wK_2 var2, wK_2 var3) {
      this.super_[0] = var1;
      this.super_[1] = var2;
      this.super_[2] = var3;
      return this.super_;
   }

   public void class_(boolean var1) {
      this.return_ = var1;
   }

   public int class_() {
      if (this.byte_ < 0) {
         this.byte_ = this.class_.continue_();
      }

      return this.byte_;
   }

   public wK_2[] class_(wK_2 var1, wK_2 var2, wK_2 var3, wK_2 var4) {
      this.this_[0] = var1;
      this.this_[1] = var2;
      this.this_[2] = var3;
      this.this_[3] = var4;
      return this.this_;
   }

   public boolean class_(List var1) {
      if (this.throws_ == -1 && var1.size() > 0) {
         if (var1.get(0) instanceof rrJl_1) {
            this.throws_ = 1;
         } else {
            this.throws_ = 0;
         }
      }

      return this.throws_ == 1;
   }

   public boolean class_(wK_2 var1) {
      if (this.throws_ < 0) {
         if (var1 instanceof rrJl_1) {
            this.throws_ = 1;
         } else {
            this.throws_ = 0;
         }
      }

      return this.throws_ == 1;
   }

   public wK_2[] break_(wK_2 var1) {
      this.new_[0] = var1;
      return this.new_;
   }

   public int break_() {
      if (this.protected_ < 0) {
         this.protected_ = this.class_.super_();
      }

      return this.protected_;
   }

   public lw_3 throws_() {
      return this.implements_;
   }

   public boolean[] finally_() {
      if (this.native_ == null) {
         this.native_ = new boolean[4];
      }

      return this.native_;
   }

   public xc_3 catch_() {
      return this.class_;
   }

   public boolean[] extends_() {
      if (this.volatile_ == null) {
         this.volatile_ = new boolean[4];
      }

      return this.volatile_;
   }

   public boolean case_() {
      return this.throws_ == 1;
   }

   public boolean[] implements_() {
      if (this.extends_ == null) {
         this.extends_ = new boolean[4];
      }

      return this.extends_;
   }

   public Long2ByteLinkedOpenHashMap new_() {
      return this.public_;
   }

   public Hv_1 package_() {
      return this.else_;
   }

   public BitSet protected_() {
      return this.private_;
   }

   public rrGi_1 private_() {
      if (this.finally_ == null) {
         this.finally_ = new rrGi_1(0, 0, 0);
      }

      return this.finally_;
   }

   public List<wK_2> final_() {
      return this.package_;
   }

   public boolean volatile_() {
      if (this.case_ == -1) {
         if (rrbb_3.static_() && this.class_.break_() instanceof kZ_2) {
            this.case_ = 1;
         } else {
            this.case_ = 0;
         }
      }

      return this.case_ == 1;
   }

   public rpr_3[] native_() {
      if (this.final_ == null) {
         this.final_ = new rpr_3[4];
      }

      return this.final_;
   }
}
