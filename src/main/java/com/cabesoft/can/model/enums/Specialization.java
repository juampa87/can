package com.cabesoft.can.model.enums;

public enum Specialization {
	DRUG_DETECTOR {
		@Override
		public String getField() {
			return "Drogas";

		}
	},
	TRAIL {
		@Override
		public String getField() {
			return "Rastro";

		}
	},
	SECURITY {
		@Override
		public String getField() {
			return "Seguridad";

		}
	},
	EXPLOSIVES {
		@Override
		public String getField() {
			return "Explosivos";

		}
	};
	public abstract String getField();
}
