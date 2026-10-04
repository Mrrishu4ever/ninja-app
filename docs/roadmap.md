# Ninja roadmap

The main goal of this project is learning. Each phase lists what I want to understand by the end of it, not just what I want to ship.

Tick a box when it's done. Last updated: 4 Oct 2026.

## Phase 1: Setup
Learning: Git/GitHub workflow, monorepo layout, Maven, CI

- [x] Create the `ninja-app` repo (public, MIT, Node .gitignore)
- [x] Write the main README
- [x] Create `api/` folder with a README
- [x] Add the GitHub Actions workflow
- [x] Create `mobile/README.md`
- [x] Create `docs/architecture.md`
- [x] Add `api/pom.xml`
- [x] Add `NinjaApiApplication.java`
- [x] Add `HealthController.java` (`GET /health`)
- [x] Add `api/target/` to `.gitignore`
- [x] First green check in the Actions tab

## Phase 2: Backend core
Learning: layered architecture, REST design, ORM, testing

- [ ] `Entry` entity and repository
- [ ] `POST /entries` and `GET /entries`
- [ ] `GET`, `PUT`, `DELETE` for a single entry
- [ ] DTOs and validation
- [ ] Global error handling
- [ ] PostgreSQL config with `application.yml`
- [ ] Flyway migrations
- [ ] Unit tests (JUnit, Mockito)
- [ ] Integration tests (Testcontainers)

## Phase 3: Auth and security
Learning: authentication vs authorization, password hashing, JWT

- [ ] User entity and signup
- [ ] Login with JWT
- [ ] Spring Security config
- [ ] Entries belong to a user
- [ ] Protect endpoints, test them

## Phase 4: Mobile app
Learning: React Native, state management, offline-first design

- [ ] Expo + TypeScript project in `mobile/`
- [ ] Navigation (Entries / New / Insights)
- [ ] Entries list screen
- [ ] New entry screen
- [ ] Connect to the API (React Query)
- [ ] Secure token storage
- [ ] Voice input
- [ ] Local SQLite storage
- [ ] Sync with the API when online

## Phase 5: AI features
Learning: using an LLM API safely, scheduled jobs

- [ ] Mood tagging for entries
- [ ] Weekly summary endpoint (Claude API)
- [ ] Keep API keys in environment variables
- [ ] Rate limiting
- [ ] Scheduled job for weekly summaries (`@Scheduled`)

## Phase 6: Production
Learning: containers, deployment, config per environment

- [ ] Dockerfile for the API
- [ ] `docker-compose.yml` (API + Postgres)
- [ ] Deploy the API
- [ ] Swagger / OpenAPI docs
- [ ] Build an Android APK with EAS

## Phase 7: Wrap-up

- [ ] README with screenshots
- [ ] Architecture diagram in `docs/`
- [ ] Short demo video
- [ ] Write down what I learned in `docs/learnings.md`

## Daily habit

- [ ] One small commit or PR a day
- [ ] One DSA problem on weekdays (`neetcode-submissions`)
