package celestial;

public class QB {
   private Qs_1 class_ = Qs_1.NORMAL;
   private boolean break_ = true;
   private boolean byte_;
   private boolean protected_;
   private boolean throws_;
   private boolean case_ = true;
   private final QS catch_;
   private boolean private_ = true;

   public QB byte_() {
      this.break_ = false;
      return this;
   }

   public QB(QS var1) {
      this.catch_ = var1;
   }

   public QB class_() {
      this.protected_ = true;
      return this;
   }

   public QB break_() {
      this.case_ = false;
      return this;
   }

   public QB throws_() {
      this.throws_ = true;
      return this;
   }

   protected QB catch_() {
      this.class_ = Qs_1.BLOCK;
      return this;
   }

   protected QB case_() {
      this.class_ = Qs_1.DESTROY;
      return this;
   }

   QB implements_() {
      this.private_ = false;
      return this;
   }

   protected QB protected_() {
      this.byte_ = true;
      return this;
   }

   public QP private_() {
      return new QP(this.catch_, this.protected_, this.case_, this.break_, this.private_, this.byte_, this.throws_, this.class_);
   }
}
