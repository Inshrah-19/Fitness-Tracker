package fitnesstrackerproject;

public class WeightLossUser extends User {
    public WeightLossUser(String username, int currentWeight, int targetWeight) {
        super(username, currentWeight, targetWeight);
    }

    public String getExercisePlan() {
        int currentWeight = getCurrentWeight();
        int targetWeight = getTargetWeight();

        if (currentWeight > targetWeight) {
            if (currentWeight - targetWeight >= 20) {
                return "Recommended exercises:\n High-intensity interval training (HIIT) to\nmaximize calorie burn and boost metabolism,\n combined with strength training to preserve muscle mass.";
            } else if (currentWeight - targetWeight >= 10) {
                return "Recommended exercises:\n Cardiovascular exercises such as running, cycling, or swimming\n for sustained calorie expenditure,\n complemented with bodyweight exercises for muscle toning.";
            } else {
                return "Recommended exercises:\n Moderate-intensity activities like brisk walking, hiking, or dancing\n for consistent calorie burning and improving cardiovascular health.";
            }
        } else {
            return "Your current weight is lower than your target weight.\n Please consider selecting a target weight lower\nthan your current weight for weight loss plans.";
        }
    }

    public String getDietPlanWeightLoss() {
        int currentWeight = getCurrentWeight();
        int targetWeight = getTargetWeight();

        if (currentWeight > targetWeight) {
            if (currentWeight - targetWeight >= 20) {
                return "Recommended diet:\n Balanced diet with reduced caloric intake from portion control\n and emphasis on whole, nutrient-dense foods such as fruits, vegetables,\n lean proteins, and fiber-rich carbohydrates.";
            } else if (currentWeight - targetWeight >= 10) {
                return "Recommended diet:\n Balanced diet with slight reduction in caloric intake\n while still ensuring adequate nutrient intake from lean proteins\n healthy fats, and complex carbohydrates.";
            } else {
                return "Recommended diet:\n Balanced diet with portion control and focus on reducing calorie consumption\n from processed foods, sugary beverages, and high-fat snacks.";
            }
        } else {
            return "Your current weight is lower than your target weight.\n Please consider selecting a target weight lower than your current weight\n for weight loss plans.";
        }
    }

    public String getNutritionTipsWeightLoss() {
        int currentWeight = getCurrentWeight();
        int targetWeight = getTargetWeight();

        if (currentWeight > targetWeight) {
            if (currentWeight - targetWeight >= 20) {
                return "Nutrition tips:\n Focus on creating a caloric deficit by reducing portion sizes,\n avoiding processed foods, and increasing intake of high-fiber foods to promote satiety and weight loss.";
            } else if (currentWeight - targetWeight >= 10) {
                return "Nutrition tips:\n Pay attention to portion sizes and reduce intake of high-calorie foods\n while increasing consumption of nutrient-dense options such as fruits, vegetables, and lean proteins.";
            } else {
                return "Nutrition tips:\n Keep track of your daily food intake and make mindful choices\n to limit calorie intake while ensuring adequate nutrition from whole,\n unprocessed foods.";
            }
        } else {
            return "Your current weight is lower than your target weight.\n Please consider selecting a target weight lower than your current weight for weight loss plans.";
        }
    }
}

